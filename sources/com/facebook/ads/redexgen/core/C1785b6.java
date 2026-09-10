package com.facebook.ads.redexgen.core;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1785b6 extends Drawable {
    public static byte[] A0G;
    public static String[] A0H = {"uAADS07vuTt2bWOOIRXTK9bzUqfZPQ", "cn6RXotf6zZwAeB3lSiWP6IveEHpbDAc", "fqHIMQcIn36ckD7HtV78", "rZKbd1qqPOm2jxQd70eAyB6uz1tOgPbY", "sxaVjDfKgR8b2unSnmAv", "1UAN8XI5lzImEv5q", "fr57qg0eWkx6ppTTUiLmxnyxz7CpPvLf", "EJnXX6RVHz5b530rZ3EkT3HbTheO6nDW"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public String A04;
    public String A05;
    public String A06;
    public WeakReference<C2076fp> A07;
    public boolean A08;
    public final Paint A09 = new Paint();
    public final Paint A0A = new Paint();
    public final Path A0C = new Path();
    public final TextPaint A0E = new TextPaint();
    public final Paint A0B = new Paint();
    public final Handler A0D = new Handler();
    public final Runnable A0F = new LQ(this);

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0G = new byte[]{12, 26, 70, 121, 117, 103, 42, 48, 101, 42, 35, 101, 60, 48, 92, 127, 113, 116, 117, 116, 48, 0, 24, 4, 7, 24, 6, 29, Utf8.REPLACEMENT_BYTE, 44, 58, 126, 7, RemoteControlWriter.BLOCK_CMDOK, 39, 58, 39, 47, 34, 39, 52, 39, RemoteControlWriter.BLOCK_CMDOK, 41, 96, 96, 96, 110, 89, 86, 29, 83, 104, 109, 104, 105, 113, 104, 107, 84, 88, 74, 92, 95, 84, 81, 84, 73, 68, 29, 126, 85, 88, 94, 86, 88, 79, 29, 83, 82, 73, 29, 78, 88, 73, 60, 116, 122, 55, 89, 10, 75, 77, 69};
    }

    static {
        A04();
    }

    public C1785b6() {
        this.A09.setColor(Color.argb(127, 36, 36, 36));
        this.A09.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A0A.setAntiAlias(true);
        this.A0A.setColor(Color.argb(Opcodes.ATHROW, 0, 255, 0));
        this.A0A.setStrokeWidth(20.0f);
        this.A0A.setStyle(Paint.Style.STROKE);
        this.A0E.setAntiAlias(true);
        this.A0E.setColor(-1);
        this.A0E.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A0E.setTextSize(30.0f);
        this.A0B.setColor(Color.argb(Sdk$SDKError.Reason.PLACEMENT_SLEEP_VALUE, 0, 0, 0));
        this.A0B.setStyle(Paint.Style.FILL_AND_STROKE);
        A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00e3  */
    public void A03() {
        StringBuilder sb = new StringBuilder();
        int i = this.A00;
        String strA02 = A02(0, 1, 9);
        if (i <= 0) {
            if (!TextUtils.isEmpty(this.A06)) {
                sb.append(this.A06);
                sb.append(strA02);
            }
            if (!TextUtils.isEmpty(this.A04)) {
                sb.append(this.A04);
                sb.append(strA02);
            }
            sb.append(A02(47, 4, 50));
            sb.append(A02(21, 6, 57));
            sb.append(A02(12, 9, 31));
            if (this.A03 > 0) {
                long jMax = Math.max(0L, System.currentTimeMillis() - this.A03);
                int i2 = (int) (jMax / 3600000);
                long j = jMax % 3600000;
                int minutes = (int) (j / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                int i3 = (int) ((j % ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) / 1000);
                if (i2 > 0) {
                    sb.append(i2);
                    sb.append(A02(85, 2, 91));
                }
                if (i2 > 0 || minutes > 0) {
                    sb.append(minutes);
                    sb.append(A02(87, 2, 24));
                }
                sb.append(i3);
                sb.append(A02(89, 5, 37));
            } else {
                sb.append(A02(51, 7, 9));
            }
        } else {
            sb.append(A02(27, 5, 81));
            sb.append(this.A01 + 1);
            sb.append(A02(8, 4, 74));
            sb.append(this.A00);
        }
        sb.append(A02(1, 7, 31));
        if (this.A07 != null) {
            C2076fp c2076fp = this.A07.get();
            String[] strArr = A0H;
            if (strArr[0].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[0] = "6PZDnglzGPDeedrgHm7ot6ei2FxWRy";
            strArr2[5] = "hXyehySpXKvAoovv";
            if (c2076fp == null) {
                sb.append(A02(58, 27, 50));
            } else {
                sb.append(this.A07.get().A0R());
            }
        } else {
            sb.append(A02(58, 27, 50));
        }
        this.A05 = sb.toString();
        float fMax = -2.1474836E9f;
        String[] strArrSplit = this.A05.split(strA02);
        for (String str : strArrSplit) {
            fMax = Math.max(fMax, this.A0E.measureText(str, 0, str.length()));
        }
        this.A02 = (int) (0.5f + fMax);
        invalidateSelf();
    }

    public final void A07() {
        this.A00 = 0;
        this.A01 = -1;
        this.A05 = A02(32, 15, 65);
        this.A02 = 100;
        this.A06 = null;
        this.A03 = -1L;
        this.A07 = null;
        A0D(false);
    }

    public final void A08(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        A03();
    }

    public final void A09(long j) {
        this.A03 = j;
        A03();
    }

    public final void A0A(C2076fp c2076fp) {
        this.A07 = new WeakReference<>(c2076fp);
        A03();
    }

    public final void A0B(String str) {
        this.A04 = str;
        A03();
    }

    public final void A0C(String str) {
        this.A06 = str;
        A03();
    }

    public final void A0D(boolean z) {
        this.A08 = z;
        if (this.A08) {
            this.A0D.post(this.A0F);
        } else {
            this.A0D.removeCallbacks(this.A0F);
        }
        invalidateSelf();
    }

    public final boolean A0E() {
        return this.A08;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.A08) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, this.A09);
        StaticLayout textLayout = new StaticLayout(this.A05, this.A0E, this.A02, Layout.Alignment.ALIGN_CENTER, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        float width2 = textLayout.getWidth() / 2.0f;
        float height2 = textLayout.getHeight() / 2.0f;
        float canvasMiddleY = f - width2;
        float textMiddleX = f2 - height2;
        float textMiddleY = f + width2;
        canvas.drawRect(canvasMiddleY - 40.0f, textMiddleX - 40.0f, textMiddleY + 40.0f, f2 + height2 + 40.0f, this.A0B);
        canvas.save();
        canvas.translate(f - width2, f2 - height2);
        textLayout.draw(canvas);
        canvas.restore();
        this.A0C.reset();
        this.A0C.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.A0C.lineTo(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.A0C.lineTo(width, height);
        this.A0C.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height);
        this.A0C.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        canvas.drawPath(this.A0C, this.A0A);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
