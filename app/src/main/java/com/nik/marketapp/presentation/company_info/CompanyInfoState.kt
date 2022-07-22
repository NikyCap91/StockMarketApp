package com.nik.marketapp.presentation.company_info

import com.nik.marketapp.domain.model.CompanyInfo
import com.nik.marketapp.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
