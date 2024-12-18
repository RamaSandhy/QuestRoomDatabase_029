package com.example.pertemuan9.Repository

import com.example.pertemuan9.data.dao.MahasiswaDao
import com.example.pertemuan9.data.entity.Mahasiswa

class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override suspend fun inserths(mahasiswa: Mahasiswa) {
        TODO("Not yet implemented")
    }

}
