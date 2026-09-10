package com.blankj.utilcode.util;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class UtilsTransActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final Map<UtilsTransActivity, TransActivityDelegate> f17472dovishness = new HashMap();

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TransActivityDelegate transActivityDelegate = f17472dovishness.get(this);
        if (transActivityDelegate == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (transActivityDelegate.dispatchTouchEvent(this, motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p000activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        TransActivityDelegate transActivityDelegate = f17472dovishness.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onActivityResult(this, i, i2, intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p000activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        overridePendingTransition(0, 0);
        Serializable serializableExtra = getIntent().getSerializableExtra("extra_delegate");
        if (!(serializableExtra instanceof TransActivityDelegate)) {
            super.onCreate(bundle);
            finish();
            return;
        }
        TransActivityDelegate transActivityDelegate = (TransActivityDelegate) serializableExtra;
        f17472dovishness.put(this, transActivityDelegate);
        transActivityDelegate.onCreateBefore(this, bundle);
        super.onCreate(bundle);
        transActivityDelegate.onCreated(this, bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Map<UtilsTransActivity, TransActivityDelegate> map = f17472dovishness;
        TransActivityDelegate transActivityDelegate = map.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onDestroy(this);
        map.remove(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
        TransActivityDelegate transActivityDelegate = f17472dovishness.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onPaused(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.p000activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        TransActivityDelegate transActivityDelegate = f17472dovishness.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        TransActivityDelegate transActivityDelegate = f17472dovishness.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onResumed(this);
    }

    @Override // androidx.p000activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TransActivityDelegate transActivityDelegate = f17472dovishness.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onSaveInstanceState(this, bundle);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        TransActivityDelegate transActivityDelegate = f17472dovishness.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onStarted(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        TransActivityDelegate transActivityDelegate = f17472dovishness.get(this);
        if (transActivityDelegate == null) {
            return;
        }
        transActivityDelegate.onStopped(this);
    }

    public static abstract class TransActivityDelegate implements Serializable {
        public boolean dispatchTouchEvent(UtilsTransActivity utilsTransActivity, MotionEvent motionEvent) {
            return false;
        }

        public void onDestroy(UtilsTransActivity utilsTransActivity) {
        }

        public void onPaused(UtilsTransActivity utilsTransActivity) {
        }

        public void onResumed(UtilsTransActivity utilsTransActivity) {
        }

        public void onStarted(UtilsTransActivity utilsTransActivity) {
        }

        public void onStopped(UtilsTransActivity utilsTransActivity) {
        }

        public void onCreateBefore(UtilsTransActivity utilsTransActivity, Bundle bundle) {
        }

        public void onCreated(UtilsTransActivity utilsTransActivity, Bundle bundle) {
        }

        public void onSaveInstanceState(UtilsTransActivity utilsTransActivity, Bundle bundle) {
        }

        public void onActivityResult(UtilsTransActivity utilsTransActivity, int i, int i2, Intent intent) {
        }

        public void onRequestPermissionsResult(UtilsTransActivity utilsTransActivity, int i, String[] strArr, int[] iArr) {
        }
    }
}
