package com.example.dictionary.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dictionary.feature_dictionary.data.remote.dto.License
import com.example.dictionary.feature_dictionary.domain.model.Meaning
import com.example.dictionary.feature_dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val license: License,
    val word: String,
    val phonetic: String,
    val sourceUrls: List<String>,
    val meanings: List<Meaning>,
    @PrimaryKey val id: Int? = null
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            license = license,
            meanings = meanings,
            word = word,
            sourceUrls = sourceUrls,
            phonetic = phonetic
        )
    }
}
