package com.facebook.ads.internal.api;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public interface AudienceNetworkActivityApi {
    public static final int EXTERNAL_FINISH_REASON = 0;

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    void finish(int i2);

    void onActivityResult(int i2, int i3, Intent intent);

    void onBackPressed();

    void onConfigurationChanged(Configuration configuration);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    boolean onTouchEvent(MotionEvent motionEvent);
}
