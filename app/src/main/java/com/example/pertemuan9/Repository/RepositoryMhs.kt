package com.example.pertemuan9.Repository

import com.example.pertemuan9.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun inserths(mahasiswa: Mahasiswa)
}