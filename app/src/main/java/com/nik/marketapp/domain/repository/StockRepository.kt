package com.nik.marketapp.domain.repository

import com.nik.marketapp.domain.model.CompanyListing
import com.nik.marketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>
}