package br.com.tecapp.mvparchitecture.ui.splash;

import android.os.CountDownTimer;

import br.com.tecapp.mvparchitecture.R;
import br.com.tecapp.mvparchitecture.shared.base.BaseActivity;
import br.com.tecapp.mvparchitecture.ui.login.LoginActivity;
import br.com.tecapp.mvparchitecture.util.NavigationUtils;

/**
 * @author Vitor Otero on 12/06/18.
 */
public class SplashActivity extends BaseActivity {

    @Override
    protected int contentLayout() {
        return R.layout.splash;
    }

    @Override
    protected void create() {
        new CountDownTimer(1000, 1000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                NavigationUtils.openActivity(SplashActivity.this,
                        LoginActivity.getIntent(SplashActivity.this)
                );
                finish();
            }
        }.start();
    }

    @Override
    protected void destroy() {

    }

    @Override
    public void showLoading() {
        throw new UnsupportedOperationException("This method is not to be called.");
    }

    @Override
    public void hideLoading() {
        throw new UnsupportedOperationException("This method is not to be called.");
    }
}
