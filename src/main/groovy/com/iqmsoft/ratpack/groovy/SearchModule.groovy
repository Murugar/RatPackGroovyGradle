package com.iqmsoft.ratpack.groovy

import com.google.inject.AbstractModule

class SearchModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ISearchService).to(SearchService)
    }
}
