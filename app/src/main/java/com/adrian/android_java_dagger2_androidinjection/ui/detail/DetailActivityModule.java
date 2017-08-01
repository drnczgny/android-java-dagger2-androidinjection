package com.adrian.android_java_dagger2_androidinjection.ui.detail;

import com.adrian.android_java_dagger2_androidinjection.data.ApiService;
import com.adrian.android_java_dagger2_androidinjection.scope.ActivityScope;
import com.adrian.android_java_dagger2_androidinjection.ui.detail.fragment.DetailFragmentComponent;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cadri on 2017. 08. 01..
 */

@Module(subcomponents = DetailFragmentComponent.class)
public class DetailActivityModule {

    @ActivityScope
    @Provides
    DetailView provideDetailView(DetailActivity detailActivity) {
        return detailActivity;
    }

    @ActivityScope
    @Provides
    DetailPresenter provideDetailPresenter(DetailView detailView, ApiService apiService) {
        return new DetailPresenterImpl(detailView, apiService);
    }

}
