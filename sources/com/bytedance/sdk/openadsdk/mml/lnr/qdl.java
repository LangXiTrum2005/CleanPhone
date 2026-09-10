package com.bytedance.sdk.openadsdk.mml.lnr;

import com.applovin.sdk.AppLovinWebViewActivity;
import com.bytedance.sdk.openadsdk.utils.gy;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.mml.lnr.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0144qdl {
        public static final String lnr;
        public static final String mml;
        public static final String mo;
        public static final String mzz;
        public static final String qdl;
        public static final String ud;

        static {
            CharSequence[] charSequenceArr = {gy.vu(), "load_start"};
            StringBuilder sb = new StringBuilder();
            sb.append(charSequenceArr[0]);
            sb.append((CharSequence) "_");
            sb.append(charSequenceArr[1]);
            qdl = sb.toString();
            CharSequence[] charSequenceArr2 = {gy.vu(), "load_finish"};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequenceArr2[0]);
            sb2.append((CharSequence) "_");
            sb2.append(charSequenceArr2[1]);
            ud = sb2.toString();
            CharSequence[] charSequenceArr3 = {gy.vu(), AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL};
            StringBuilder sb3 = new StringBuilder();
            sb3.append(charSequenceArr3[0]);
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr3[1]);
            lnr = sb3.toString();
            CharSequence[] charSequenceArr4 = {gy.vu(), gy.koa()};
            StringBuilder sb4 = new StringBuilder();
            sb4.append(charSequenceArr4[0]);
            sb4.append((CharSequence) "_");
            sb4.append(charSequenceArr4[1]);
            mml = sb4.toString();
            CharSequence[] charSequenceArr5 = {gy.vu(), gy.koa(), "show"};
            StringBuilder sb5 = new StringBuilder();
            sb5.append(charSequenceArr5[0]);
            for (int i2 = 1; i2 < 3; i2++) {
                sb5.append((CharSequence) "_");
                sb5.append(charSequenceArr5[i2]);
            }
            mzz = sb5.toString();
            CharSequence[] charSequenceArr6 = {gy.vu(), gy.koa(), "progress"};
            StringBuilder sb6 = new StringBuilder();
            sb6.append(charSequenceArr6[0]);
            for (int i3 = 1; i3 < 3; i3++) {
                sb6.append((CharSequence) "_");
                sb6.append(charSequenceArr6[i3]);
            }
            mo = sb6.toString();
        }
    }
}
