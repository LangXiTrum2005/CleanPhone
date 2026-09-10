package com.bytedance.sdk.openadsdk.ZU.lk;

import com.bytedance.sdk.openadsdk.utils.nJ;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ZU.lk.Lxb$Lxb, reason: collision with other inner class name */
    public interface InterfaceC0082Lxb {
        public static final String JXs;
        public static final String LD;
        public static final String Lxb;
        public static final String ZU;
        public static final String lc;
        public static final String lk;

        static {
            CharSequence[] charSequenceArr = {nJ.Sfi(), "load_start"};
            StringBuilder sb = new StringBuilder();
            sb.append(charSequenceArr[0]);
            sb.append((CharSequence) "_");
            sb.append(charSequenceArr[1]);
            Lxb = sb.toString();
            CharSequence[] charSequenceArr2 = {nJ.Sfi(), "load_finish"};
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequenceArr2[0]);
            sb2.append((CharSequence) "_");
            sb2.append(charSequenceArr2[1]);
            LD = sb2.toString();
            CharSequence[] charSequenceArr3 = {nJ.Sfi(), "load_url"};
            StringBuilder sb3 = new StringBuilder();
            sb3.append(charSequenceArr3[0]);
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr3[1]);
            lk = sb3.toString();
            CharSequence[] charSequenceArr4 = {nJ.Sfi(), nJ.DY()};
            StringBuilder sb4 = new StringBuilder();
            sb4.append(charSequenceArr4[0]);
            sb4.append((CharSequence) "_");
            sb4.append(charSequenceArr4[1]);
            ZU = sb4.toString();
            CharSequence[] charSequenceArr5 = {nJ.Sfi(), nJ.DY(), "show"};
            StringBuilder sb5 = new StringBuilder();
            sb5.append(charSequenceArr5[0]);
            for (int i = 1; i < 3; i++) {
                sb5.append((CharSequence) "_");
                sb5.append(charSequenceArr5[i]);
            }
            JXs = sb5.toString();
            CharSequence[] charSequenceArr6 = {nJ.Sfi(), nJ.DY(), "progress"};
            StringBuilder sb6 = new StringBuilder();
            sb6.append(charSequenceArr6[0]);
            for (int i2 = 1; i2 < 3; i2++) {
                sb6.append((CharSequence) "_");
                sb6.append(charSequenceArr6[i2]);
            }
            lc = sb6.toString();
        }
    }
}
