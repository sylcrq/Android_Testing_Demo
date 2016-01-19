package com.syl.demo.androidtestdemo;

import android.content.Context;

/**
 * Created by shenyunlong on 1/19/16.
 */
public class ClassUnderTest {

    private Context mContext;

    public ClassUnderTest(Context context) {
        this.mContext = context;
    }

    public String getHelloWorldString() {
        return mContext.getString(R.string.hello_word);
    }
}
