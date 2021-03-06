package br.com.tecapp.mvparchitecture.shared.dagger.shared;

import android.app.Application;

import javax.inject.Singleton;

import br.com.tecapp.mvparchitecture.ui.BaseApplication;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author Vitor Otero on 12/06/18.
 */
@Singleton
@Component(modules = {
        ApplicationModule.class,
        ServiceModule.class,
        ManagerModule.class,
        RepositoryModule.class,
        UiModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}




