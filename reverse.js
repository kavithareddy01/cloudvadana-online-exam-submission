function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => reverseWord(word));
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
   }
   function reverseWord(word) {
    return word.split('').reverse().join('');
   }
   // Example usage:
   const inputSentence = "this is a sunny day";
   const reversedSentence = reverseWordsInSentence(inputSentence);
   console.log(reversedSentence); 