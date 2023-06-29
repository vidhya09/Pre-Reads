const words = ['Miss', 'madam', 'Mrs.'];

//Custom map function to switch words to uppercase
function myMap(array, caseFunc) {
    const upperCaseWords = [];
    for (let i = 0; i < array.length; i++) {
        upperCaseWords[i]=caseFunc(array[i]);
    }
    return upperCaseWords;
  }
  const mapWords = myMap(words, function(word) {
    return word.toUpperCase();
  }); 
  console.log(mapWords);

//Custom filter to retrieve palindrome words
function myFilter(array, palindromeFunc) {
  const palindromeWords = [];
  for (let i = 0; i < array.length; i++) {
    if (palindromeFunc(array[i])) {
      palindromeWords.push(array[i]);
    }
  }
  return palindromeWords;
}
const filterWords = myFilter(words, function(word) {
  const revWord = word.split('').reverse().join('');
  return word === revWord;
});
console.log(filterWords);

//Custom reduce to concatenate array
function myReduce(arr, callback, value) {
  var accumulator = value;
  for (var i = 0; i < arr.length; i++) {
    accumulator = callback(accumulator, arr[i]);
  }
  return accumulator;
}
const concatWords = myReduce(words, (accumulator, currentValue) => {
  return accumulator + ' ' + currentValue;
}, '');
console.log(concatWords);

//Custom forEach for displaying concatenated words in array 
function myForEach(array, callback) {
    for (let i = 0; i < array.length; i++) {
      callback(array[i], i, array);
    }
  }
  myForEach(words, function(word, index) {
    console.log(word+' '+'Maria');
  });

