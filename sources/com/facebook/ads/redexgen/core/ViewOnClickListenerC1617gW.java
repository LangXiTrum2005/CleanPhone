package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC1617gW extends FW implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", ExifInterface.LONGITUDE_EAST, "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C1828k1 A05;
    public CH A06;
    public C1619gY A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final FQ A0B;
    public final Map<String, String> A0C;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{-30, -21, -24, -30, -22, -34, -14, -18, -12, -15, -30, -28, -23, -27, -80, -16, -24, -10, -10, -24, -15, -22, -24, -11, 40, 38, 24, 37, 22, 31, 28, 22, 30};
    }

    static {
        A08();
        A0F = (int) (CP.A02 * 24.0f);
    }

    public ViewOnClickListenerC1617gW(C1828k1 c1828k1, AbstractC1984md abstractC1984md, C03912c c03912c, A7 a7, DR dr, JL jl, C0647Cv c0647Cv, CZ cz) {
        this(c1828k1, abstractC1984md.A0e(), c03912c, abstractC1984md.A1b().A0H().A06(), a7, dr, jl, c0647Cv, abstractC1984md.A1c(), cz);
        this.A0B.A04(abstractC1984md);
    }

    public ViewOnClickListenerC1617gW(C1828k1 c1828k1, String str, C03912c c03912c, A7 a7, DR dr, JL jl, C0647Cv c0647Cv, C03962h c03962h) {
        this(c1828k1, str, c03912c, false, a7, dr, jl, c0647Cv, c03962h);
    }

    public ViewOnClickListenerC1617gW(C1828k1 c1828k1, String str, C03912c c03912c, boolean z, A7 a7, DR dr, JL jl, C0647Cv c0647Cv, C03962h c03962h) {
        super(c1828k1, c03912c);
        this.A0C = new HashMap();
        this.A05 = c1828k1;
        this.A0A = z;
        this.A0B = new FQ(c1828k1, str, jl, c0647Cv, a7, c03962h, dr);
        setOnClickListener(this);
        D3.A0E(1001, this);
    }

    public ViewOnClickListenerC1617gW(C1828k1 c1828k1, String str, C03912c c03912c, boolean z, A7 a7, DR dr, JL jl, C0647Cv c0647Cv, C03962h c03962h, CZ cz) {
        super(c1828k1, c03912c);
        this.A0C = new HashMap();
        this.A05 = c1828k1;
        this.A0A = z;
        this.A0B = new FQ(c1828k1, str, jl, c0647Cv, a7, c03962h, dr, cz);
        setOnClickListener(this);
        D3.A0E(1001, this);
    }

    public static Bitmap A04(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private void A06() {
        if (this.A0A && this.A09 != null) {
            this.A02 = A04(DC.A03(this.A05, this.A09.contains(A05(12, 12, 10)) ? DB.MESSENGER : DB.WHATSAPP));
            this.A03 = new Paint();
            setPadding(A0F, 0, A0F, 0);
        }
    }

    private void A07() {
        if (this.A06 != null) {
            CH ch = this.A06;
            if (A0E[0].charAt(27) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            ch.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static boolean A09(AbstractC1984md abstractC1984md) {
        return ((long) abstractC1984md.A1Y()) > 0 && abstractC1984md.A1W() >= 0;
    }

    public final void A0A(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return;
        }
        A07();
        this.A0C.put(A05(0, 12, 6), str);
        this.A0B.A08(this.A08, this.A09, this.A0C);
    }

    public final boolean A0B(AbstractC1984md abstractC1984md, DQ dq) {
        if (this.A06 != null || !A09(abstractC1984md) || abstractC1984md.A1f().A01() == null || abstractC1984md.A1f().A00() == null) {
            return false;
        }
        this.A07 = new C1619gY(abstractC1984md.A1W(), abstractC1984md.A1Y(), abstractC1984md.A1X(), abstractC1984md.A1f().A01(), abstractC1984md.A1f().A00(), dq, this);
        this.A06 = new CH(abstractC1984md.A1Y(), this.A07);
        this.A06.A07();
        return true;
    }

    public FQ getCtaActionHelper() {
        return this.A0B;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            A0A(A05(24, 9, 58));
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A07();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float width = (getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f);
            float textWidth = this.A01;
            float f = width - textWidth;
            float textWidth2 = this.A00;
            int i = (int) (f - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i, top, left + i, this.A01 + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            A07();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            A07();
        }
    }

    public void setCreativeAsCtaLoggingHelper(CL cl) {
        this.A0B.A05(cl);
    }

    public void setCta(C03922d c03922d, String str, Map<String, String> extraData) {
        setCta(c03922d, str, extraData, null);
    }

    public void setCta(C03922d c03922d, String str, Map<String, String> extraData, CZ cz, FP fp) {
        setCta(c03922d, str, extraData, fp);
        this.A0B.A06(cz);
    }

    public void setCta(C03922d c03922d, String str, Map<String, String> extraData, FP fp) {
        this.A08 = str;
        this.A09 = c03922d.A05();
        this.A0C.putAll(extraData);
        this.A0B.A07(fp);
        String strA04 = c03922d.A04();
        if (!TextUtils.isEmpty(strA04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(strA04);
                A06();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z) {
        this.A0B.A09(z);
    }
}
