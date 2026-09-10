package com.badlogic.gdx.backends.android.keyboardheight;

import android.R;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class StandardKeyboardHeightProvider extends PopupWindow implements KeyboardHeightProvider {
    private static final String TAG = "sample_KeyboardHeightProvider";
    private static int keyboardLandscapeHeight;
    private static int keyboardPortraitHeight;
    private Activity activity;
    private KeyboardHeightObserver observer;
    private View parentView;
    private View popupView;

    public StandardKeyboardHeightProvider(Activity activity) {
        super(activity);
        this.activity = activity;
        LinearLayout linearLayout = new LinearLayout(((LayoutInflater) activity.getSystemService("layout_inflater")).getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.popupView = linearLayout;
        setContentView(linearLayout);
        setSoftInputMode(21);
        setInputMethodMode(1);
        setWidth(0);
        setHeight(-1);
        this.popupView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.badlogic.gdx.backends.android.keyboardheight.StandardKeyboardHeightProvider.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (StandardKeyboardHeightProvider.this.popupView != null) {
                    StandardKeyboardHeightProvider.this.handleOnGlobalLayout();
                }
            }
        });
    }

    private int getScreenOrientation() {
        return this.activity.getResources().getConfiguration().orientation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnGlobalLayout() {
        Point point = new Point();
        this.activity.getWindowManager().getDefaultDisplay().getSize(point);
        Rect rect = new Rect();
        this.popupView.getWindowVisibleDisplayFrame(rect);
        int screenOrientation = getScreenOrientation();
        int i = point.y - rect.bottom;
        int i2 = rect.left;
        int iAbs = Math.abs((point.x - rect.right) + i2);
        if (i == 0) {
            notifyKeyboardHeightChanged(0, i2, iAbs, screenOrientation);
        } else if (screenOrientation == 1) {
            keyboardPortraitHeight = i;
            notifyKeyboardHeightChanged(i, i2, iAbs, screenOrientation);
        } else {
            keyboardLandscapeHeight = i;
            notifyKeyboardHeightChanged(i, i2, iAbs, screenOrientation);
        }
    }

    private void notifyKeyboardHeightChanged(int i, int i2, int i3, int i4) {
        KeyboardHeightObserver keyboardHeightObserver = this.observer;
        if (keyboardHeightObserver != null) {
            keyboardHeightObserver.onKeyboardHeightChanged(i, i2, i3, i4);
        }
    }

    @Override // com.badlogic.gdx.backends.android.keyboardheight.KeyboardHeightProvider
    public void close() {
        this.observer = null;
        dismiss();
    }

    @Override // com.badlogic.gdx.backends.android.keyboardheight.KeyboardHeightProvider
    public int getKeyboardLandscapeHeight() {
        return keyboardLandscapeHeight;
    }

    @Override // com.badlogic.gdx.backends.android.keyboardheight.KeyboardHeightProvider
    public int getKeyboardPortraitHeight() {
        return keyboardPortraitHeight;
    }

    @Override // com.badlogic.gdx.backends.android.keyboardheight.KeyboardHeightProvider
    public void setKeyboardHeightObserver(KeyboardHeightObserver keyboardHeightObserver) {
        this.observer = keyboardHeightObserver;
    }

    @Override // com.badlogic.gdx.backends.android.keyboardheight.KeyboardHeightProvider
    public void start() {
        this.parentView = this.activity.findViewById(R.id.content);
        if (isShowing() || this.parentView.getWindowToken() == null) {
            return;
        }
        setBackgroundDrawable(new ColorDrawable(0));
        showAtLocation(this.parentView, 0, 0, 0);
    }
}
