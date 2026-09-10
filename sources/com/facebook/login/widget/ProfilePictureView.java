package com.facebook.login.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.charging.screenshow.battery.animations.themes.R;
import com.facebook.AccessToken;
import com.facebook.AccessTokenManager;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.Profile;
import com.facebook.ProfileManager;
import com.facebook.ProfileTracker;
import com.facebook.internal.ImageDownloader;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.ImageResponse;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ProfilePictureView extends FrameLayout {
    public String e0;
    public int f0;
    public int g0;
    public boolean h0;
    public int i0;
    public ImageRequest j0;
    public OnErrorListener k0;
    public Bitmap l0;

    /* JADX INFO: renamed from: com.facebook.login.widget.ProfilePictureView$1, reason: invalid class name */
    class AnonymousClass1 extends ProfileTracker {
    }

    public interface OnErrorListener {
        void a();
    }

    public static void a(ProfilePictureView profilePictureView, ImageResponse imageResponse) {
        profilePictureView.getClass();
        if (CrashShieldHandler.b(profilePictureView)) {
            return;
        }
        try {
            if (imageResponse.f16343a == profilePictureView.j0) {
                profilePictureView.j0 = null;
                Bitmap bitmap = imageResponse.d;
                Exception exc = imageResponse.f16344b;
                if (exc == null) {
                    if (bitmap != null) {
                        profilePictureView.setImageBitmap(bitmap);
                        if (imageResponse.f16345c) {
                            profilePictureView.d(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                OnErrorListener onErrorListener = profilePictureView.k0;
                if (onErrorListener != null) {
                    new FacebookException("Error in downloading profile picture for profileId: " + profilePictureView.getProfileId(), exc);
                    onErrorListener.a();
                    return;
                }
                LoggingBehavior loggingBehavior = LoggingBehavior.X;
                String string = exc.toString();
                HashMap map = Logger.d;
                Logger.Companion.b(loggingBehavior, "ProfilePictureView", string);
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(profilePictureView, th);
        }
    }

    private void setImageBitmap(Bitmap bitmap) {
        CrashShieldHandler.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
    
        if (r5 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(boolean r5) {
        /*
            r4 = this;
            boolean r0 = com.facebook.internal.instrument.crashshield.CrashShieldHandler.b(r4)
            r1 = 0
            if (r0 == 0) goto L8
            goto L1c
        L8:
            int r0 = r4.i0     // Catch: java.lang.Throwable -> L2d
            r2 = -4
            if (r0 == r2) goto L21
            r2 = -3
            r3 = 2131165297(0x7f070071, float:1.7944807E38)
            if (r0 == r2) goto L24
            r2 = -2
            if (r0 == r2) goto L1d
            r2 = -1
            if (r0 == r2) goto L1a
            goto L1c
        L1a:
            if (r5 != 0) goto L24
        L1c:
            return r1
        L1d:
            r3 = 2131165298(0x7f070072, float:1.794481E38)
            goto L24
        L21:
            r3 = 2131165296(0x7f070070, float:1.7944805E38)
        L24:
            android.content.res.Resources r5 = r4.getResources()     // Catch: java.lang.Throwable -> L2d
            int r5 = r5.getDimensionPixelSize(r3)     // Catch: java.lang.Throwable -> L2d
            return r5
        L2d:
            r5 = move-exception
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.a(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.widget.ProfilePictureView.b(boolean):int");
    }

    public final void c(boolean z2) {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            boolean zF = f();
            String str = this.e0;
            if (str != null && str.length() != 0 && (this.g0 != 0 || this.f0 != 0)) {
                if (!zF && !z2) {
                    return;
                }
                d(true);
                return;
            }
            e();
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public final void d(boolean z2) {
        Throwable th;
        String str;
        String str2;
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            Date date = AccessToken.m0;
            String str3 = "";
            if (AccessToken.Companion.c()) {
                try {
                    str = AccessToken.Companion.b().f0;
                } catch (Throwable th2) {
                    th = th2;
                    CrashShieldHandler.a(this, th);
                }
            } else {
                str = "";
            }
            Uri uriA = ImageRequest.Companion.a(this.g0, this.f0, this.e0, str);
            Profile profile = ProfileManager.f15957e.a().f15958a;
            AccessToken accessToken = AccessTokenManager.g.a().f15879a;
            if (accessToken != null && !accessToken.b() && (str2 = accessToken.l0) != null && str2.equals("instagram") && profile != null) {
                int i2 = this.g0;
                int i3 = this.f0;
                Uri uri = profile.h0;
                if (uri != null) {
                    uriA = uri;
                } else {
                    if (AccessToken.Companion.c()) {
                        AccessToken accessTokenB = AccessToken.Companion.b();
                        str3 = accessTokenB != null ? accessTokenB.f0 : null;
                    }
                    uriA = ImageRequest.Companion.a(i2, i3, profile.X, str3);
                }
            }
            Uri uri2 = uriA;
            Context context = getContext();
            ImageRequest.Builder builder = new ImageRequest.Builder(context, uri2);
            ImageRequest.Callback callback = new ImageRequest.Callback() { // from class: com.facebook.login.widget.ProfilePictureView.2
                @Override // com.facebook.internal.ImageRequest.Callback
                public final void a(ImageResponse imageResponse) {
                    ProfilePictureView.a(ProfilePictureView.this, imageResponse);
                }
            };
            builder.f16340a = callback;
            try {
                ImageRequest imageRequest = new ImageRequest(context, uri2, callback, z2, this);
                ImageRequest imageRequest2 = this.j0;
                if (imageRequest2 != null) {
                    ImageDownloader.c(imageRequest2);
                }
                this.j0 = imageRequest;
                ImageDownloader.d(imageRequest);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                CrashShieldHandler.a(this, th);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void e() {
        if (CrashShieldHandler.b(this)) {
            return;
        }
        try {
            ImageRequest imageRequest = this.j0;
            if (imageRequest != null) {
                ImageDownloader.c(imageRequest);
            }
            if (this.l0 == null) {
                setImageBitmap(BitmapFactory.decodeResource(getResources(), this.h0 ? R.drawable.com_facebook_profile_picture_blank_square : R.drawable.com_facebook_profile_picture_blank_portrait));
            } else {
                f();
                setImageBitmap(Bitmap.createScaledBitmap(this.l0, this.g0, this.f0, false));
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
        }
    }

    public final boolean f() {
        if (CrashShieldHandler.b(this)) {
            return false;
        }
        try {
            int height = getHeight();
            int width = getWidth();
            boolean z2 = true;
            if (width >= 1 && height >= 1) {
                int iB = b(false);
                if (iB != 0) {
                    height = iB;
                    width = height;
                }
                if (width <= height) {
                    height = this.h0 ? width : 0;
                } else {
                    width = this.h0 ? height : 0;
                }
                if (width == this.g0 && height == this.f0) {
                    z2 = false;
                }
                this.g0 = width;
                this.f0 = height;
                return z2;
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.a(this, th);
            return false;
        }
    }

    public final OnErrorListener getOnErrorListener() {
        return this.k0;
    }

    public final int getPresetSize() {
        return this.i0;
    }

    public final String getProfileId() {
        return this.e0;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j0 = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        c(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        boolean z2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z3 = true;
        if (View.MeasureSpec.getMode(i3) == 1073741824 || layoutParams.height != -2) {
            z2 = false;
        } else {
            size = b(true);
            i3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            z2 = true;
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824 || layoutParams.width != -2) {
            z3 = z2;
        } else {
            size2 = b(true);
            i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
        }
        if (!z3) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(size2, size);
            measureChildren(i2, i3);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable.getClass() != Bundle.class) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("ProfilePictureView_superState"));
        this.e0 = bundle.getString("ProfilePictureView_profileId");
        this.i0 = bundle.getInt("ProfilePictureView_presetSize");
        this.h0 = bundle.getBoolean("ProfilePictureView_isCropped");
        this.g0 = bundle.getInt("ProfilePictureView_width");
        this.f0 = bundle.getInt("ProfilePictureView_height");
        c(true);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", parcelableOnSaveInstanceState);
        bundle.putString("ProfilePictureView_profileId", this.e0);
        bundle.putInt("ProfilePictureView_presetSize", this.i0);
        bundle.putBoolean("ProfilePictureView_isCropped", this.h0);
        bundle.putInt("ProfilePictureView_width", this.g0);
        bundle.putInt("ProfilePictureView_height", this.f0);
        bundle.putBoolean("ProfilePictureView_refresh", this.j0 != null);
        return bundle;
    }

    public final void setCropped(boolean z2) {
        this.h0 = z2;
        c(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.l0 = bitmap;
    }

    public final void setOnErrorListener(OnErrorListener onErrorListener) {
        this.k0 = onErrorListener;
    }

    public final void setPresetSize(int i2) {
        if (i2 != -4 && i2 != -3 && i2 != -2 && i2 != -1) {
            throw new IllegalArgumentException("Must use a predefined preset size");
        }
        this.i0 = i2;
        requestLayout();
    }

    public final void setProfileId(String str) {
        boolean z2;
        if (Utility.C(this.e0) || !this.e0.equalsIgnoreCase(str)) {
            e();
            z2 = true;
        } else {
            z2 = false;
        }
        this.e0 = str;
        c(z2);
    }

    public final void setShouldUpdateOnProfileChange(boolean z2) {
        if (!z2) {
            throw null;
        }
        throw null;
    }
}
