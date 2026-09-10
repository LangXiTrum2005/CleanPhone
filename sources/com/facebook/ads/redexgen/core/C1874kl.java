package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1874kl extends C05026m implements AdOptionsViewApi {
    public static byte[] A06;
    public static String[] A07 = {"HVqi6jlpWuJt2YtXNdvGk3FhV0BHl3EV", "MmKJ6DDV7RS65o7dKLAsYGebg3Me5CTe", "1YJN2Qnc4ttaIZRVWQztvMy6euLicnbf", "AdY32lBMWhACAu5OzQBb3WT", "7pW2kqTunwh3p", "By284lxDKeQhXfwWoADF7ASQT9nDXNCZ", "", "3GcamP2dghLgpW6nys2YEXVC3i8y"};
    public static final int A08;
    public static final int A09;
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final ImageView A03;
    public final ImageView A04;
    public final AdOptionsView A05;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {81, 102, 115, 108, 113, 119, 35, 66, 103};
        String[] strArr = A07;
        if (strArr[3].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[3] = "u5VvbSB0F1Ye86S0UUtiEMk";
        strArr2[7] = "xkynJM0f4daSI4M9ryujsiLCexBq";
        A06 = bArr;
    }

    static {
        A02();
        A08 = (int) (CP.A02 * 23.0f);
        A09 = (int) (CP.A02 * 4.0f);
    }

    public C1874kl(final Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i, AdOptionsView adOptionsView) {
        this.A02 = false;
        this.A01 = false;
        this.A00 = false;
        this.A05 = adOptionsView;
        final LinearLayout linearLayout = new LinearLayout(context);
        this.A05.addView(linearLayout);
        linearLayout.setOrientation(orientation != AdOptionsView.Orientation.HORIZONTAL ? 1 : 0);
        this.A04 = A00(DB.DEFAULT_INFO_ICON);
        this.A03 = A00(DB.AD_CHOICES_ICON);
        this.A03.setContentDescription(A01(0, 9, 53));
        linearLayout.addView(this.A04);
        linearLayout.addView(this.A03);
        setIconSizeDp(i);
        setIconColor(-10459280);
        final C1744ie c1744ieA0L = C1744ie.A0L(nativeAdBase.getInternalNativeAd());
        c1744ieA0L.A1V(nativeAdLayout);
        c1744ieA0L.A1X(this);
        C2002mv c2002mvA0z = c1744ieA0L.A0z();
        if (c2002mvA0z != null && c2002mvA0z.A0R() && !c2002mvA0z.A0P()) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.6b
                public static String[] A04 = {"dOcdx", "8bjq9", "S62xmG9bLAzPQTe5DIuTVykAuxzH3OOO", "EFLmmctArUbvil4YjfVv5mcKtZGwqpiw", "pomIX56rypqB03AcIrSNKF", "mejemOmbs1cZK7MlHCtmuskixcqeH5iG", "45z4wnlhvnWTCVb", "bTLTNp7fFtJJ30XE5CJx6is"};

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    if (BQ.A02(this)) {
                        return;
                    }
                    try {
                        c1744ieA0L.A1J();
                        if (C05789m.A2Q(context)) {
                            linearLayout.performAccessibilityAction(128, null);
                        }
                    } catch (Throwable th) {
                        BQ.A00(th, this);
                        String[] strArr = A04;
                        if (strArr[0].length() != strArr[1].length()) {
                            throw new RuntimeException();
                        }
                        A04[3] = "4MuYgj3AagdEPQ2lSwdOEm9Gyp8HLE2k";
                    }
                }
            });
            CU.A04(this.A05, CU.A0C);
        }
    }

    public C1874kl(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        this(context, nativeAdBase, nativeAdLayout, AdOptionsView.Orientation.HORIZONTAL, 23, adOptionsView);
    }

    private ImageView A00(DB db) {
        ImageView imageView = new ImageView(this.A05.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(A09, A09, A09, A09);
        imageView.setImageBitmap(DC.A01(db));
        return imageView;
    }

    public final void A03(DB db) {
        this.A04.setImageBitmap(DC.A01(db));
    }

    public final boolean A04() {
        return this.A00;
    }

    public final boolean A05() {
        return this.A01;
    }

    public final boolean A06() {
        return this.A02;
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconColor(int i) {
        this.A04.setColorFilter(i);
        this.A03.setColorFilter(i);
        this.A00 = true;
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setIconSizeDp(int i) {
        int iconSize = Math.max(A08, (int) (CP.A02 * i));
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(iconSize, iconSize);
        this.A04.setLayoutParams(iconParams);
        this.A03.setLayoutParams(iconParams);
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.C05026m, com.facebook.ads.internal.api.AdComponentView
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = -2;
        super.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.internal.api.AdOptionsViewApi
    public final void setSingleIcon(boolean z) {
        D3.A0L(this.A04, z ? 8 : 0);
        this.A02 = true;
    }
}
