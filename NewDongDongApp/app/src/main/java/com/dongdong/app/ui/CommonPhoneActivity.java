package com.dongdong.app.ui;

import com.dd121.community.R;
import com.dongdong.app.base.BaseActivity;
import com.dongdong.app.widget.TitleBar;
import com.dongdong.app.widget.TitleBar.OnTitleBarClickListener;

public class CommonPhoneActivity extends BaseActivity implements OnTitleBarClickListener {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_commom_phone;
    }

    @Override
    public void initView() {
        TitleBar titleBar = (TitleBar) this.findViewById(R.id.tb_title);
        titleBar.setTitleBarContent(getString(R.string.phone));
        titleBar.setOnTitleBarClickListener(this);
        titleBar.setAddArrowShowing(false);
    }

    @Override
    public void initData() {
    }

    @Override
    public void onBackClick() {
        CommonPhoneActivity.this.finish();
    }

    @Override
    public void onTitleClick() {

    }

    @Override
    public void onAddClick() {
    }

    @Override
    public void onFinishClick() {
    }
}
