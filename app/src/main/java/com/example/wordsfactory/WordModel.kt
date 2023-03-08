package com.example.wordsfactory

data class WordModel (
    var word: String,
    var phonetic: String,
    var phonetics: ArrayList<PhoneModel>,
    var meanings: ArrayList<MeaningModel>
)