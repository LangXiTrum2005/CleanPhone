package sakeen;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: compiled from: TypefaceEmojiRasterizer.java */
/* JADX INFO: loaded from: classes.dex */
public class cutely {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final ThreadLocal<immediately.attabal> f37032wireman = new ThreadLocal<>();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f37033attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public volatile int f37034dern = 0;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final androidx.emoji2.text.beachfront f37035saneness;

    public cutely(androidx.emoji2.text.beachfront beachfrontVar, int i) {
        this.f37035saneness = beachfrontVar;
        this.f37033attabal = i;
    }

    public boolean apical() {
        return (this.f37034dern & 4) > 0;
    }

    public void attabal(Canvas canvas, float f, float f2, Paint paint) {
        Typeface typefaceCompetently = this.f37035saneness.competently();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceCompetently);
        canvas.drawText(this.f37035saneness.dern(), this.f37033attabal * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public int beachfront() {
        return competently().formularize();
    }

    public final immediately.attabal competently() {
        ThreadLocal<immediately.attabal> threadLocal = f37032wireman;
        immediately.attabal attabalVar = threadLocal.get();
        if (attabalVar == null) {
            attabalVar = new immediately.attabal();
            threadLocal.set(attabalVar);
        }
        this.f37035saneness.wireman().cutely(attabalVar, this.f37033attabal);
        return attabalVar;
    }

    public boolean cutely() {
        return competently().cutely();
    }

    public int dern() {
        return competently().taiyuan();
    }

    public void formularize(boolean z) {
        int iWireman = wireman();
        if (z) {
            this.f37034dern = iWireman | 4;
        } else {
            this.f37034dern = iWireman;
        }
    }

    public void impassible(boolean z) {
        int i = this.f37034dern & 4;
        this.f37034dern = z ? i | 2 : i | 1;
    }

    public short impromptu() {
        return competently().impassible();
    }

    public int marial() {
        return competently().apical();
    }

    public int saneness(int i) {
        return competently().impromptu(i);
    }

    public int taiyuan() {
        return competently().triweekly();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(beachfront()));
        sb.append(", codepoints:");
        int iDern = dern();
        for (int i = 0; i < iDern; i++) {
            sb.append(Integer.toHexString(saneness(i)));
            sb.append(" ");
        }
        return sb.toString();
    }

    public int wireman() {
        return this.f37034dern & 3;
    }
}
