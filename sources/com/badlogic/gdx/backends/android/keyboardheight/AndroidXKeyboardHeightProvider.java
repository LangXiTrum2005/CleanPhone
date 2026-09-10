package com.badlogic.gdx.backends.android.keyboardheight;

import android.R;
import android.app.Activity;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: classes.dex */
public class AndroidXKeyboardHeightProvider implements KeyboardHeightProvider {
    private static int keyboardLandscapeHeight;
    private static int keyboardPortraitHeight;
    private final Activity activity;
    private KeyboardHeightObserver observer;
    private View view;

    public AndroidXKeyboardHeightProvider(Activity activity) {
        this.activity = activity;
    }

    @Override // com.badlogic.gdx.backends.android.keyboardheight.KeyboardHeightProvider
    public void close() {
        View view = this.view;
        if (view != null) {
            ViewCompat.setOnApplyWindowInsetsListener(view, null);
        }
        this.observer = null;
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
        View viewFindViewById = this.activity.findViewById(R.id.content);
        this.view = viewFindViewById;
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new OnApplyWindowInsetsListener() { // from class: com.badlogic.gdx.backends.android.keyboardheight.AndroidXKeyboardHeightProvider.1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                if (AndroidXKeyboardHeightProvider.this.observer == null) {
                    return windowInsetsCompat;
                }
                int i = AndroidXKeyboardHeightProvider.this.activity.getResources().getConfiguration().orientation;
                if (windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime())) {
                    Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
                    if (i == 1) {
                        int unused = AndroidXKeyboardHeightProvider.keyboardPortraitHeight = insets.bottom;
                    } else {
                        int unused2 = AndroidXKeyboardHeightProvider.keyboardLandscapeHeight = insets.bottom;
                    }
                    AndroidXKeyboardHeightProvider.this.observer.onKeyboardHeightChanged(insets.bottom, windowInsetsCompat.getInsets(-1).left, windowInsetsCompat.getInsets(-1).right, i);
                } else {
                    AndroidXKeyboardHeightProvider.this.observer.onKeyboardHeightChanged(0, 0, 0, i);
                }
                return windowInsetsCompat;
            }
        });
    }
}
