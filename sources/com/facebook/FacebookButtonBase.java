package com.facebook;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.view.View;
import android.widget.Button;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FacebookButtonBase extends Button {
    public View.OnClickListener e0;
    public View.OnClickListener f0;
    public boolean g0;
    public int h0;
    public int i0;
    public FragmentWrapper j0;

    /* JADX INFO: renamed from: com.facebook.FacebookButtonBase$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }
    }

    public final void a(View view) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.e0;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public final int b(String str) {
        if (CrashShieldHandler.b(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil(getPaint().measureText(str));
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return 0;
        }
    }

    public Activity getActivity() {
        if (CrashShieldHandler.b(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new FacebookException("Unable to get Activity.");
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return null;
        }
    }

    public String getAnalyticsButtonCreatedEventName() {
        CrashShieldHandler.b(this);
        return null;
    }

    public String getAnalyticsButtonTappedEventName() {
        CrashShieldHandler.b(this);
        return null;
    }

    public ActivityResultRegistryOwner getAndroidxActivityResultRegistryOwner() {
        if (CrashShieldHandler.b(this)) {
            return null;
        }
        try {
            ComponentCallbacks2 activity = getActivity();
            if (activity instanceof ActivityResultRegistryOwner) {
                return (ActivityResultRegistryOwner) activity;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return null;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (CrashShieldHandler.b(this)) {
            return 0;
        }
        try {
            return this.g0 ? this.h0 : super.getCompoundPaddingLeft();
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return 0;
        }
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        if (CrashShieldHandler.b(this)) {
            return 0;
        }
        try {
            return this.g0 ? this.i0 : super.getCompoundPaddingRight();
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return 0;
        }
    }

    public abstract int getDefaultRequestCode();

    public int getDefaultStyleResource() {
        CrashShieldHandler.b(this);
        return 0;
    }

    public Fragment getFragment() {
        if (CrashShieldHandler.b(this)) {
            return null;
        }
        try {
            FragmentWrapper fragmentWrapper = this.j0;
            if (fragmentWrapper != null) {
                return fragmentWrapper.f16323a;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return null;
        }
    }

    public android.app.Fragment getNativeFragment() {
        if (CrashShieldHandler.b(this)) {
            return null;
        }
        try {
            FragmentWrapper fragmentWrapper = this.j0;
            if (fragmentWrapper != null) {
                return fragmentWrapper.f16324b;
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return null;
        }
    }

    public int getRequestCode() {
        if (CrashShieldHandler.b(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return 0;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            super.onAttachedToWindow();
            if (!isInEditMode()) {
                Context context = getContext();
                if (!CrashShieldHandler.b(this)) {
                    try {
                        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(context);
                        HashSet hashSet = FacebookSdk.f15915a;
                        if (UserSettingsManager.c()) {
                            internalAppEventsLogger.f16027a.f(null, null);
                        }
                    } catch (Throwable th) {
                        CrashShieldHandler.a(this, th);
                    }
                }
            }
        } catch (Throwable th2) {
            CrashShieldHandler.a(this, th2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            if ((getGravity() & 1) != 0) {
                int compoundPaddingLeft = getCompoundPaddingLeft();
                int compoundPaddingRight = getCompoundPaddingRight();
                int iMin = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - b(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                this.h0 = compoundPaddingLeft - iMin;
                this.i0 = compoundPaddingRight + iMin;
                this.g0 = true;
            }
            super.onDraw(canvas);
            this.g0 = false;
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public void setFragment(Fragment fragment) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            this.j0 = new FragmentWrapper(fragment);
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            this.f0 = onClickListener;
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            this.e0 = onClickListener;
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public void setFragment(android.app.Fragment fragment) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            this.j0 = new FragmentWrapper(fragment);
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }
}
