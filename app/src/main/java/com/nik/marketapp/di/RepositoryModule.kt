package com.nik.marketapp.di;

import com.nik.marketapp.data.csv.CSVParser
import com.nik.marketapp.data.csv.CompanyListingsParser
import com.nik.marketapp.data.csv.IntradayInfoParser
import com.nik.marketapp.data.repository.StockRepositoryImpl
import com.nik.marketapp.domain.model.CompanyListing
import com.nik.marketapp.domain.model.IntradayInfo
import com.nik.marketapp.domain.repository.StockRepository
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>


    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository

}
