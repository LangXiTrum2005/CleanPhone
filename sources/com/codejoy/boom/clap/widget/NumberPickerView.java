package com.codejoy.boom.clap.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.codejoy.boom.clap.polloi;
import com.google.android.gms.ads.AdSize;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes2.dex */
public class NumberPickerView extends View {

    /* JADX INFO: renamed from: achondroplasia, reason: collision with root package name */
    public int f18663achondroplasia;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public int f18664adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f18665arytenoidectomy;

    /* JADX INFO: renamed from: attendance, reason: collision with root package name */
    public float f18666attendance;

    /* JADX INFO: renamed from: claque, reason: collision with root package name */
    public float f18667claque;

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name */
    public float f18668clubfoot;

    /* JADX INFO: renamed from: coffeecake, reason: collision with root package name */
    public boolean f18669coffeecake;

    /* JADX INFO: renamed from: coi, reason: collision with root package name */
    public TextPaint f18670coi;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public int f18671cord;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name */
    public int f18672creditor;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public int f18673cuirassed;

    /* JADX INFO: renamed from: cultivated, reason: collision with root package name */
    public boolean f18674cultivated;

    /* JADX INFO: renamed from: czestochowa, reason: collision with root package name */
    public Paint f18675czestochowa;

    /* JADX INFO: renamed from: deadwork, reason: collision with root package name */
    public int f18676deadwork;

    /* JADX INFO: renamed from: dent, reason: collision with root package name */
    public float f18677dent;

    /* JADX INFO: renamed from: dhss, reason: collision with root package name */
    public int f18678dhss;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f18679dovishness;

    /* JADX INFO: renamed from: empress, reason: collision with root package name */
    public Paint f18680empress;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public int f18681gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f18682graveside;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public int f18683grimness;

    /* JADX INFO: renamed from: gusty, reason: collision with root package name */
    public Handler f18684gusty;

    /* JADX INFO: renamed from: hardpan, reason: collision with root package name */
    public float f18685hardpan;

    /* JADX INFO: renamed from: herdbook, reason: collision with root package name */
    public float f18686herdbook;

    /* JADX INFO: renamed from: homozygous, reason: collision with root package name */
    public int f18687homozygous;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public int f18688hydrovane;

    /* JADX INFO: renamed from: igbo, reason: collision with root package name */
    public Handler f18689igbo;

    /* JADX INFO: renamed from: itchy, reason: collision with root package name */
    public boolean f18690itchy;

    /* JADX INFO: renamed from: julian, reason: collision with root package name */
    public int f18691julian;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public int f18692kattegat;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f18693kowloon;

    /* JADX INFO: renamed from: lampshade, reason: collision with root package name */
    public int f18694lampshade;

    /* JADX INFO: renamed from: lerp, reason: collision with root package name */
    public boolean f18695lerp;

    /* JADX INFO: renamed from: libyan, reason: collision with root package name */
    public int f18696libyan;

    /* JADX INFO: renamed from: lightstruck, reason: collision with root package name */
    public int f18697lightstruck;

    /* JADX INFO: renamed from: lotta, reason: collision with root package name */
    public Scroller f18698lotta;

    /* JADX INFO: renamed from: mastfed, reason: collision with root package name */
    public float f18699mastfed;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public String f18700mathsort;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public int f18701merc;

    /* JADX INFO: renamed from: milliradian, reason: collision with root package name */
    public boolean f18702milliradian;

    /* JADX INFO: renamed from: molet, reason: collision with root package name */
    public int f18703molet;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f18704molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f18705monoploid;

    /* JADX INFO: renamed from: monroe, reason: collision with root package name */
    public int f18706monroe;

    /* JADX INFO: renamed from: nosophobia, reason: collision with root package name */
    public Drawable f18707nosophobia;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public int f18708oilcan;

    /* JADX INFO: renamed from: outmarry, reason: collision with root package name */
    public int f18709outmarry;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public float f18710overspeculate;

    /* JADX INFO: renamed from: palmyra, reason: collision with root package name */
    public wireman f18711palmyra;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public String f18712peridotite;

    /* JADX INFO: renamed from: permissivist, reason: collision with root package name */
    public float f18713permissivist;

    /* JADX INFO: renamed from: picketboat, reason: collision with root package name */
    public Map<String, Integer> f18714picketboat;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public int f18715polder;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public int f18716polloi;

    /* JADX INFO: renamed from: premeiotic, reason: collision with root package name */
    public boolean f18717premeiotic;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public int f18718preprohormone;

    /* JADX INFO: renamed from: preterite, reason: collision with root package name */
    public CharSequence[] f18719preterite;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
    public int f18720privatdozent;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public int f18721restrictive;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public int f18722rotuma;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public int f18723saran;

    /* JADX INFO: renamed from: sayid, reason: collision with root package name */
    public VelocityTracker f18724sayid;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public int f18725sealless;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public int f18726seminary;

    /* JADX INFO: renamed from: sensatory, reason: collision with root package name */
    public String[] f18727sensatory;

    /* JADX INFO: renamed from: setterwort, reason: collision with root package name */
    public float f18728setterwort;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
    public String f18729splinterproof;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name */
    public int f18730starveling;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public int f18731stratoscope;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public int f18732supplicat;

    /* JADX INFO: renamed from: technofreak, reason: collision with root package name */
    public boolean f18733technofreak;

    /* JADX INFO: renamed from: timberyard, reason: collision with root package name */
    public boolean f18734timberyard;

    /* JADX INFO: renamed from: treadless, reason: collision with root package name */
    public boolean f18735treadless;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public int f18736trm;

    /* JADX INFO: renamed from: unconsolidated, reason: collision with root package name */
    public int f18737unconsolidated;

    /* JADX INFO: renamed from: underbelly, reason: collision with root package name */
    public CharSequence[] f18738underbelly;

    /* JADX INFO: renamed from: vesuvio, reason: collision with root package name */
    public int f18739vesuvio;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public String f18740walach;

    /* JADX INFO: renamed from: wostteth, reason: collision with root package name */
    public HandlerThread f18741wostteth;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public int f18742yemenite;

    public class attabal extends Handler {
        public attabal(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int iSealless;
            int i;
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                NumberPickerView.this.hydrovane(message.arg1, message.arg2, message.obj);
                return;
            }
            int i3 = 0;
            if (!NumberPickerView.this.f18698lotta.isFinished()) {
                if (NumberPickerView.this.f18697lightstruck == 0) {
                    NumberPickerView.this.creditor(1);
                }
                NumberPickerView.this.f18689igbo.sendMessageDelayed(NumberPickerView.this.trm(1, 0, 0, message.obj), 32L);
                return;
            }
            if (NumberPickerView.this.f18694lampshade != 0) {
                if (NumberPickerView.this.f18697lightstruck == 0) {
                    NumberPickerView.this.creditor(1);
                }
                if (NumberPickerView.this.f18694lampshade < (-NumberPickerView.this.f18739vesuvio) / 2) {
                    i = (int) (((NumberPickerView.this.f18739vesuvio + NumberPickerView.this.f18694lampshade) * 300.0f) / NumberPickerView.this.f18739vesuvio);
                    NumberPickerView.this.f18698lotta.startScroll(0, NumberPickerView.this.f18696libyan, 0, NumberPickerView.this.f18739vesuvio + NumberPickerView.this.f18694lampshade, i * 3);
                    NumberPickerView numberPickerView = NumberPickerView.this;
                    iSealless = numberPickerView.sealless(numberPickerView.f18696libyan + NumberPickerView.this.f18739vesuvio + NumberPickerView.this.f18694lampshade);
                } else {
                    i = (int) (((-NumberPickerView.this.f18694lampshade) * 300.0f) / NumberPickerView.this.f18739vesuvio);
                    NumberPickerView.this.f18698lotta.startScroll(0, NumberPickerView.this.f18696libyan, 0, NumberPickerView.this.f18694lampshade, i * 3);
                    NumberPickerView numberPickerView2 = NumberPickerView.this;
                    iSealless = numberPickerView2.sealless(numberPickerView2.f18696libyan + NumberPickerView.this.f18694lampshade);
                }
                i3 = i;
                NumberPickerView.this.postInvalidate();
            } else {
                NumberPickerView.this.creditor(0);
                NumberPickerView numberPickerView3 = NumberPickerView.this;
                iSealless = numberPickerView3.sealless(numberPickerView3.f18696libyan);
            }
            NumberPickerView numberPickerView4 = NumberPickerView.this;
            Message messageTrm = numberPickerView4.trm(2, numberPickerView4.f18672creditor, iSealless, message.obj);
            if (NumberPickerView.this.f18695lerp) {
                NumberPickerView.this.f18684gusty.sendMessageDelayed(messageTrm, i3 * 2);
            } else {
                NumberPickerView.this.f18689igbo.sendMessageDelayed(messageTrm, i3 * 2);
            }
        }
    }

    public interface beachfront {
    }

    public interface dern {
    }

    public interface marial {
    }

    public class saneness extends Handler {
        public saneness() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 2) {
                NumberPickerView.this.hydrovane(message.arg1, message.arg2, message.obj);
            } else {
                if (i != 3) {
                    return;
                }
                NumberPickerView.this.requestLayout();
            }
        }
    }

    public interface wireman {
        void attabal(NumberPickerView numberPickerView, int i, int i2);
    }

    public NumberPickerView(Context context) {
        super(context);
        this.f18693kowloon = -13421773;
        this.f18665arytenoidectomy = -695533;
        this.f18705monoploid = -695533;
        this.f18716polloi = 0;
        this.f18704molybdenite = 0;
        this.f18682graveside = 0;
        this.f18664adultoid = 0;
        this.f18679dovishness = 0;
        this.f18681gintrap = 0;
        this.f18722rotuma = 0;
        this.f18718preprohormone = 0;
        this.f18671cord = 0;
        this.f18673cuirassed = -695533;
        this.f18731stratoscope = 2;
        this.f18736trm = 0;
        this.f18708oilcan = 0;
        this.f18742yemenite = 3;
        this.f18725sealless = 0;
        this.f18692kattegat = 0;
        this.f18732supplicat = -1;
        this.f18721restrictive = -1;
        this.f18701merc = 0;
        this.f18715polder = 0;
        this.f18726seminary = 0;
        this.f18683grimness = 0;
        this.f18723saran = 0;
        this.f18720privatdozent = 0;
        this.f18672creditor = 0;
        this.f18730starveling = Opcodes.FCMPG;
        this.f18688hydrovane = 8;
        this.f18710overspeculate = 1.0f;
        this.f18668clubfoot = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18677dent = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18713permissivist = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18674cultivated = true;
        this.f18717premeiotic = true;
        this.f18734timberyard = false;
        this.f18702milliradian = false;
        this.f18735treadless = true;
        this.f18690itchy = false;
        this.f18669coffeecake = false;
        this.f18695lerp = true;
        this.f18707nosophobia = null;
        this.f18680empress = new Paint();
        this.f18670coi = new TextPaint();
        this.f18675czestochowa = new Paint();
        this.f18714picketboat = new ConcurrentHashMap();
        this.f18697lightstruck = 0;
        this.f18667claque = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18685hardpan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18686herdbook = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18733technofreak = false;
        this.f18687homozygous = 0;
        this.f18694lampshade = 0;
        this.f18696libyan = 0;
        this.f18676deadwork = 0;
        this.f18703molet = 0;
        supplicat(context);
    }

    private TextUtils.TruncateAt getEllipsizeType() {
        String str = this.f18712peridotite;
        str.getClass();
        switch (str) {
            case "middle":
                return TextUtils.TruncateAt.MIDDLE;
            case "end":
                return TextUtils.TruncateAt.END;
            case "start":
                return TextUtils.TruncateAt.START;
            default:
                throw new IllegalArgumentException("Illegal text ellipsize type.");
        }
    }

    public final void adultoid(Canvas canvas) {
        if (TextUtils.isEmpty(this.f18740walach)) {
            return;
        }
        canvas.drawText(this.f18740walach, this.f18666attendance + ((this.f18726seminary + this.f18664adultoid) / 2) + this.f18681gintrap, ((this.f18728setterwort + this.f18699mastfed) / 2.0f) + this.f18713permissivist, this.f18675czestochowa);
    }

    public final void arytenoidectomy(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f18742yemenite)) {
            return;
        }
        walach(i - (i2 / 2));
    }

    public final void clubfoot(String[] strArr) {
        this.f18727sensatory = strArr;
        coffeecake();
    }

    public final void coffeecake() {
        this.f18735treadless = this.f18727sensatory.length > this.f18742yemenite;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f18739vesuvio != 0 && this.f18698lotta.computeScrollOffset()) {
            this.f18696libyan = this.f18698lotta.getCurrY();
            triweekly();
            postInvalidate();
        }
    }

    public final int cord(int i, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (!z) {
            return i;
        }
        int i3 = i % i2;
        return i3 < 0 ? i3 + i2 : i3;
    }

    public final void creditor(int i) {
        if (this.f18697lightstruck == i) {
            return;
        }
        this.f18697lightstruck = i;
    }

    public final int cuirassed(CharSequence[] charSequenceArr, Paint paint) {
        if (charSequenceArr == null) {
            return 0;
        }
        int iMax = 0;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence != null) {
                iMax = Math.max(yemenite(charSequence, paint), iMax);
            }
        }
        return iMax;
    }

    public final void cultivated() {
        float textSize = this.f18670coi.getTextSize();
        this.f18670coi.setTextSize(this.f18704molybdenite);
        this.f18683grimness = (int) (((double) (this.f18670coi.getFontMetrics().bottom - this.f18670coi.getFontMetrics().top)) + 0.5d);
        this.f18670coi.setTextSize(textSize);
    }

    public final void dent() {
        int i = this.f18742yemenite;
        int i2 = i / 2;
        this.f18725sealless = i2;
        int i3 = i2 + 1;
        this.f18692kattegat = i3;
        int i4 = this.f18678dhss;
        this.f18728setterwort = (i2 * i4) / i;
        this.f18699mastfed = (i3 * i4) / i;
        if (this.f18736trm < 0) {
            this.f18736trm = 0;
        }
        if (this.f18708oilcan < 0) {
            this.f18708oilcan = 0;
        }
        if (this.f18736trm + this.f18708oilcan != 0 && getPaddingLeft() + this.f18736trm >= (this.f18709outmarry - getPaddingRight()) - this.f18708oilcan) {
            int paddingLeft = getPaddingLeft() + this.f18736trm + getPaddingRight();
            int i5 = this.f18708oilcan;
            int i6 = (paddingLeft + i5) - this.f18709outmarry;
            int i7 = this.f18736trm;
            float f = i6;
            int i8 = (int) (i7 - ((i7 * f) / (i7 + i5)));
            this.f18736trm = i8;
            this.f18708oilcan = (int) (i5 - ((f * i5) / (i8 + i5)));
        }
    }

    public final void dovishness(Canvas canvas) {
        if (this.f18674cultivated) {
            canvas.drawLine(getPaddingLeft() + this.f18736trm, this.f18728setterwort, (this.f18709outmarry - getPaddingRight()) - this.f18708oilcan, this.f18728setterwort, this.f18680empress);
            canvas.drawLine(getPaddingLeft() + this.f18736trm, this.f18699mastfed, (this.f18709outmarry - getPaddingRight()) - this.f18708oilcan, this.f18699mastfed, this.f18680empress);
        }
    }

    public String getContentByCurrValue() {
        return this.f18727sensatory[getValue() - this.f18701merc];
    }

    public String[] getDisplayedValues() {
        return this.f18727sensatory;
    }

    public int getMaxValue() {
        return this.f18715polder;
    }

    public int getMinValue() {
        return this.f18701merc;
    }

    public int getOneRecycleSize() {
        return (this.f18721restrictive - this.f18732supplicat) + 1;
    }

    public int getPickedIndexRelativeToRaw() {
        int i = this.f18694lampshade;
        if (i == 0) {
            return sealless(this.f18696libyan);
        }
        int i2 = this.f18739vesuvio;
        return i < (-i2) / 2 ? sealless(this.f18696libyan + i2 + i) : sealless(this.f18696libyan + i);
    }

    public int getRawContentSize() {
        String[] strArr = this.f18727sensatory;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public int getValue() {
        return getPickedIndexRelativeToRaw() + this.f18701merc;
    }

    public boolean getWrapSelectorWheel() {
        return this.f18717premeiotic;
    }

    public boolean getWrapSelectorWheelAbsolutely() {
        return this.f18717premeiotic && this.f18735treadless;
    }

    public final void gintrap(Canvas canvas) {
        if (this.f18707nosophobia != null) {
            canvas.save();
            this.f18707nosophobia.setBounds(getPaddingLeft() + this.f18736trm, (int) this.f18728setterwort, (this.f18709outmarry - getPaddingRight()) - this.f18708oilcan, (int) this.f18699mastfed);
            this.f18707nosophobia.draw(canvas);
            canvas.restore();
        }
    }

    public final void graveside(Canvas canvas) {
        float fPreprohormone;
        float fPreprohormone2;
        float f;
        int iRotuma;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = 0;
        while (i < this.f18742yemenite + 1) {
            float f3 = this.f18694lampshade + (this.f18739vesuvio * i);
            int iCord = cord(this.f18687homozygous + i, getOneRecycleSize(), this.f18717premeiotic && this.f18735treadless);
            int i2 = this.f18742yemenite;
            if (i == i2 / 2) {
                int i3 = this.f18739vesuvio;
                f = (this.f18694lampshade + i3) / i3;
                iRotuma = rotuma(f, this.f18693kowloon, this.f18665arytenoidectomy);
                fPreprohormone = preprohormone(f, this.f18716polloi, this.f18704molybdenite);
                fPreprohormone2 = preprohormone(f, this.f18668clubfoot, this.f18677dent);
            } else if (i == (i2 / 2) + 1) {
                float f4 = 1.0f - f2;
                int iRotuma2 = rotuma(f4, this.f18693kowloon, this.f18665arytenoidectomy);
                float fPreprohormone3 = preprohormone(f4, this.f18716polloi, this.f18704molybdenite);
                float fPreprohormone4 = preprohormone(f4, this.f18668clubfoot, this.f18677dent);
                f = f2;
                iRotuma = iRotuma2;
                fPreprohormone = fPreprohormone3;
                fPreprohormone2 = fPreprohormone4;
            } else {
                int i4 = this.f18693kowloon;
                fPreprohormone = this.f18716polloi;
                fPreprohormone2 = this.f18668clubfoot;
                f = f2;
                iRotuma = i4;
            }
            this.f18670coi.setColor(iRotuma);
            this.f18670coi.setTextSize(fPreprohormone);
            if (iCord >= 0 && iCord < getOneRecycleSize()) {
                CharSequence charSequenceEllipsize = this.f18727sensatory[iCord + this.f18732supplicat];
                if (this.f18712peridotite != null) {
                    charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f18670coi, getWidth() - (this.f18671cord * 2), getEllipsizeType());
                }
                canvas.drawText(charSequenceEllipsize.toString(), this.f18666attendance, f3 + (this.f18739vesuvio / 2) + fPreprohormone2, this.f18670coi);
            } else if (!TextUtils.isEmpty(this.f18700mathsort)) {
                canvas.drawText(this.f18700mathsort, this.f18666attendance, f3 + (this.f18739vesuvio / 2) + fPreprohormone2, this.f18670coi);
            }
            i++;
            f2 = f;
        }
    }

    public final int grimness(int i) {
        if (!this.f18717premeiotic || !this.f18735treadless) {
            int i2 = this.f18737unconsolidated;
            if (i < i2) {
                return i2;
            }
            int i3 = this.f18663achondroplasia;
            if (i > i3) {
                return i3;
            }
        }
        return i;
    }

    public final void hydrovane(int i, int i2, Object obj) {
        wireman wiremanVar;
        creditor(0);
        if (i != i2 && ((obj == null || !(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) && (wiremanVar = this.f18711palmyra) != null)) {
            int i3 = this.f18701merc;
            wiremanVar.attabal(this, i + i3, i3 + i2);
        }
        this.f18672creditor = i2;
        if (this.f18690itchy) {
            this.f18690itchy = false;
            polder();
        }
    }

    public final void itchy() {
        kattegat();
        coffeecake();
        if (this.f18732supplicat == -1) {
            this.f18732supplicat = 0;
        }
        if (this.f18721restrictive == -1) {
            this.f18721restrictive = this.f18727sensatory.length - 1;
        }
        setMinAndMaxShowIndex(this.f18732supplicat, this.f18721restrictive, false);
    }

    public final void kattegat() {
        if (this.f18727sensatory == null) {
            this.f18727sensatory = new String[]{"0"};
        }
    }

    public final void kowloon(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        for (int i = 0; i < this.f18742yemenite; i++) {
            int i2 = this.f18739vesuvio;
            if (i2 * i <= y && y < i2 * (i + 1)) {
                arytenoidectomy(i);
                return;
            }
        }
    }

    public final int mathsort(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final void merc() {
        HandlerThread handlerThread = new HandlerThread("HandlerThread-For-Refreshing");
        this.f18741wostteth = handlerThread;
        handlerThread.start();
        this.f18689igbo = new attabal(this.f18741wostteth.getLooper());
        this.f18684gusty = new saneness();
    }

    public final void milliradian() {
        this.f18663achondroplasia = 0;
        this.f18737unconsolidated = (-this.f18742yemenite) * this.f18739vesuvio;
        if (this.f18727sensatory != null) {
            int oneRecycleSize = getOneRecycleSize();
            int i = this.f18742yemenite;
            int i2 = this.f18739vesuvio;
            this.f18663achondroplasia = ((oneRecycleSize - (i / 2)) - 1) * i2;
            this.f18737unconsolidated = (-(i / 2)) * i2;
        }
    }

    public final int molybdenite(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final String[] monoploid(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            return null;
        }
        String[] strArr = new String[charSequenceArr.length];
        for (int i = 0; i < charSequenceArr.length; i++) {
            strArr[i] = charSequenceArr[i].toString();
        }
        return strArr;
    }

    public final float oilcan(Paint.FontMetrics fontMetrics) {
        return fontMetrics == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerThread handlerThread = this.f18741wostteth;
        if (handlerThread == null || !handlerThread.isAlive()) {
            merc();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18741wostteth.quit();
        if (this.f18739vesuvio == 0) {
            return;
        }
        if (!this.f18698lotta.isFinished()) {
            this.f18698lotta.abortAnimation();
            this.f18696libyan = this.f18698lotta.getCurrY();
            triweekly();
            int i = this.f18694lampshade;
            if (i != 0) {
                int i2 = this.f18739vesuvio;
                if (i < (-i2) / 2) {
                    this.f18696libyan = this.f18696libyan + i2 + i;
                } else {
                    this.f18696libyan += i;
                }
                triweekly();
            }
            creditor(0);
        }
        int iSealless = sealless(this.f18696libyan);
        int i3 = this.f18672creditor;
        if (iSealless != i3 && this.f18669coffeecake) {
            try {
                wireman wiremanVar = this.f18711palmyra;
                if (wiremanVar != null) {
                    int i4 = this.f18701merc;
                    wiremanVar.attabal(this, i3 + i4, i4 + iSealless);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f18672creditor = iSealless;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gintrap(canvas);
        graveside(canvas);
        dovishness(canvas);
        adultoid(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        premeiotic(false);
        setMeasuredDimension(privatdozent(i), saran(i2));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003d  */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int value;
        super.onSizeChanged(i, i2, i3, i4);
        this.f18709outmarry = i;
        this.f18678dhss = i2;
        this.f18739vesuvio = i2 / this.f18742yemenite;
        this.f18666attendance = ((i + getPaddingLeft()) - getPaddingRight()) / 2.0f;
        boolean z = false;
        if (getOneRecycleSize() <= 1) {
            value = 0;
        } else if (this.f18702milliradian) {
            value = getValue() - this.f18701merc;
        } else if (this.f18734timberyard) {
            value = this.f18687homozygous + ((this.f18742yemenite - 1) / 2);
        } else {
            value = 0;
        }
        if (this.f18717premeiotic && this.f18735treadless) {
            z = true;
        }
        polloi(value, z);
        permissivist();
        milliradian();
        dent();
        this.f18702milliradian = true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f18739vesuvio == 0) {
            return true;
        }
        if (this.f18724sayid == null) {
            this.f18724sayid = VelocityTracker.obtain();
        }
        this.f18724sayid.addMovement(motionEvent);
        this.f18686herdbook = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f18733technofreak = true;
            this.f18689igbo.removeMessages(1);
            overspeculate();
            this.f18685hardpan = this.f18686herdbook;
            this.f18667claque = this.f18696libyan;
            creditor(0);
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action != 1) {
            if (action == 2) {
                float f = this.f18685hardpan - this.f18686herdbook;
                if (this.f18733technofreak) {
                    int i = this.f18688hydrovane;
                    if ((-i) >= f || f >= i) {
                        this.f18733technofreak = false;
                        this.f18696libyan = grimness((int) (this.f18667claque + f));
                        triweekly();
                        invalidate();
                    }
                } else {
                    this.f18733technofreak = false;
                    this.f18696libyan = grimness((int) (this.f18667claque + f));
                    triweekly();
                    invalidate();
                }
                creditor(1);
            } else if (action == 3) {
                this.f18667claque = this.f18696libyan;
                overspeculate();
                this.f18689igbo.sendMessageDelayed(stratoscope(1), 0L);
            }
        } else if (this.f18733technofreak) {
            kowloon(motionEvent);
        } else {
            VelocityTracker velocityTracker = this.f18724sayid;
            velocityTracker.computeCurrentVelocity(1000);
            int yVelocity = (int) (velocityTracker.getYVelocity() * this.f18710overspeculate);
            if (Math.abs(yVelocity) > this.f18730starveling) {
                this.f18698lotta.fling(0, this.f18696libyan, 0, -yVelocity, Integer.MIN_VALUE, Integer.MAX_VALUE, grimness(Integer.MIN_VALUE), grimness(Integer.MAX_VALUE));
                invalidate();
                creditor(2);
            }
            this.f18689igbo.sendMessageDelayed(stratoscope(1), 0L);
            starveling();
        }
        return true;
    }

    public void overspeculate() {
        Scroller scroller = this.f18698lotta;
        if (scroller == null || scroller.isFinished()) {
            return;
        }
        Scroller scroller2 = this.f18698lotta;
        scroller2.startScroll(0, scroller2.getCurrY(), 0, 0, 1);
        this.f18698lotta.abortAnimation();
        postInvalidate();
    }

    public final void peridotite(int i, boolean z) {
        int pickedIndexRelativeToRaw;
        int pickedIndexRelativeToRaw2;
        int i2;
        int i3;
        if ((!this.f18717premeiotic || !this.f18735treadless) && ((pickedIndexRelativeToRaw2 = (pickedIndexRelativeToRaw = getPickedIndexRelativeToRaw()) + i) > (i2 = this.f18721restrictive) || pickedIndexRelativeToRaw2 < (i2 = this.f18732supplicat))) {
            i = i2 - pickedIndexRelativeToRaw;
        }
        int i4 = this.f18694lampshade;
        int i5 = this.f18739vesuvio;
        if (i4 < (-i5) / 2) {
            int i6 = i5 + i4;
            int i7 = (int) (((i4 + i5) * 300.0f) / i5);
            i3 = i < 0 ? (-i7) - (i * AdSize.MEDIUM_RECTANGLE_WIDTH) : i7 + (i * AdSize.MEDIUM_RECTANGLE_WIDTH);
            i4 = i6;
        } else {
            int i8 = (int) (((-i4) * 300.0f) / i5);
            i3 = i < 0 ? i8 - (i * AdSize.MEDIUM_RECTANGLE_WIDTH) : i8 + (i * AdSize.MEDIUM_RECTANGLE_WIDTH);
        }
        int i9 = i4 + (i * i5);
        if (i3 < 300) {
            i3 = 300;
        }
        int i10 = i3 > 600 ? 600 : i3;
        this.f18698lotta.startScroll(0, this.f18696libyan, 0, i9, i10);
        if (z) {
            this.f18689igbo.sendMessageDelayed(stratoscope(1), i10 / 4);
        } else {
            this.f18689igbo.sendMessageDelayed(trm(1, 0, 0, new Boolean(z)), i10 / 4);
        }
        postInvalidate();
    }

    public final void permissivist() {
        int i = this.f18716polloi;
        int i2 = this.f18739vesuvio;
        if (i > i2) {
            this.f18716polloi = i2;
        }
        if (this.f18704molybdenite > i2) {
            this.f18704molybdenite = i2;
        }
        Paint paint = this.f18675czestochowa;
        if (paint == null) {
            throw new IllegalArgumentException("mPaintHint should not be null.");
        }
        paint.setTextSize(this.f18682graveside);
        this.f18713permissivist = oilcan(this.f18675czestochowa.getFontMetrics());
        this.f18664adultoid = yemenite(this.f18740walach, this.f18675czestochowa);
        TextPaint textPaint = this.f18670coi;
        if (textPaint == null) {
            throw new IllegalArgumentException("mPaintText should not be null.");
        }
        textPaint.setTextSize(this.f18704molybdenite);
        this.f18677dent = oilcan(this.f18670coi.getFontMetrics());
        this.f18670coi.setTextSize(this.f18716polloi);
        this.f18668clubfoot = oilcan(this.f18670coi.getFontMetrics());
    }

    public final void polder() {
        polloi(getPickedIndexRelativeToRaw() - this.f18732supplicat, false);
        this.f18717premeiotic = false;
        postInvalidate();
    }

    public final void polloi(int i, boolean z) {
        int i2 = i - ((this.f18742yemenite - 1) / 2);
        this.f18687homozygous = i2;
        int iCord = cord(i2, getOneRecycleSize(), z);
        this.f18687homozygous = iCord;
        int i3 = this.f18739vesuvio;
        if (i3 == 0) {
            this.f18734timberyard = true;
            return;
        }
        this.f18696libyan = i3 * iCord;
        int i4 = iCord + (this.f18742yemenite / 2);
        this.f18706monroe = i4;
        int oneRecycleSize = i4 % getOneRecycleSize();
        this.f18706monroe = oneRecycleSize;
        if (oneRecycleSize < 0) {
            this.f18706monroe = oneRecycleSize + getOneRecycleSize();
        }
        this.f18691julian = this.f18706monroe;
        triweekly();
    }

    public final void premeiotic(boolean z) {
        timberyard();
        cultivated();
        if (z) {
            if (this.f18676deadwork == Integer.MIN_VALUE || this.f18703molet == Integer.MIN_VALUE) {
                this.f18684gusty.sendEmptyMessage(3);
            }
        }
    }

    public final float preprohormone(float f, float f2, float f3) {
        return f2 + ((f3 - f2) * f);
    }

    public final int privatdozent(int i) {
        int mode = View.MeasureSpec.getMode(i);
        this.f18676deadwork = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight() + Math.max(this.f18723saran, Math.max(this.f18726seminary, this.f18720privatdozent) + (((Math.max(this.f18664adultoid, this.f18679dovishness) != 0 ? this.f18681gintrap : 0) + Math.max(this.f18664adultoid, this.f18679dovishness) + (Math.max(this.f18664adultoid, this.f18679dovishness) == 0 ? 0 : this.f18722rotuma) + (this.f18671cord * 2)) * 2));
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    public final void restrictive(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, polloi.NumberPickerView);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == polloi.NumberPickerView_npv_ShownCount) {
                this.f18742yemenite = typedArrayObtainStyledAttributes.getInt(index, 3);
            } else if (index == polloi.NumberPickerView_npv_DividerColor) {
                this.f18673cuirassed = typedArrayObtainStyledAttributes.getColor(index, -695533);
            } else if (index == polloi.NumberPickerView_npv_DividerHeight) {
                this.f18731stratoscope = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 2);
            } else if (index == polloi.NumberPickerView_npv_DividerMarginLeft) {
                this.f18736trm = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == polloi.NumberPickerView_npv_DividerMarginRight) {
                this.f18708oilcan = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == polloi.NumberPickerView_npv_TextArray) {
                this.f18727sensatory = monoploid(typedArrayObtainStyledAttributes.getTextArray(index));
            } else if (index == polloi.NumberPickerView_npv_TextColorNormal) {
                this.f18693kowloon = typedArrayObtainStyledAttributes.getColor(index, -13421773);
            } else if (index == polloi.NumberPickerView_npv_TextColorSelected) {
                this.f18665arytenoidectomy = typedArrayObtainStyledAttributes.getColor(index, -695533);
            } else if (index == polloi.NumberPickerView_npv_TextColorHint) {
                this.f18705monoploid = typedArrayObtainStyledAttributes.getColor(index, -695533);
            } else if (index == polloi.NumberPickerView_npv_TextSizeNormal) {
                this.f18716polloi = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mathsort(context, 14.0f));
            } else if (index == polloi.NumberPickerView_npv_TextSizeSelected) {
                this.f18704molybdenite = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mathsort(context, 16.0f));
            } else if (index == polloi.NumberPickerView_npv_TextSizeHint) {
                this.f18682graveside = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, mathsort(context, 14.0f));
            } else if (index == polloi.NumberPickerView_npv_MinValue) {
                this.f18732supplicat = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == polloi.NumberPickerView_npv_MaxValue) {
                this.f18721restrictive = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == polloi.NumberPickerView_npv_WrapSelectorWheel) {
                this.f18717premeiotic = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == polloi.NumberPickerView_npv_ShowDivider) {
                this.f18674cultivated = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == polloi.NumberPickerView_npv_HintText) {
                this.f18740walach = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == polloi.NumberPickerView_npv_AlternativeHint) {
                this.f18729splinterproof = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == polloi.NumberPickerView_npv_EmptyItemHint) {
                this.f18700mathsort = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == polloi.NumberPickerView_npv_MarginStartOfHint) {
                this.f18681gintrap = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, molybdenite(context, 8.0f));
            } else if (index == polloi.NumberPickerView_npv_MarginEndOfHint) {
                this.f18722rotuma = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, molybdenite(context, 8.0f));
            } else if (index == polloi.NumberPickerView_npv_ItemPaddingVertical) {
                this.f18718preprohormone = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, molybdenite(context, 2.0f));
            } else if (index == polloi.NumberPickerView_npv_ItemPaddingHorizontal) {
                this.f18671cord = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, molybdenite(context, 5.0f));
            } else if (index == polloi.NumberPickerView_npv_AlternativeTextArrayWithMeasureHint) {
                this.f18738underbelly = typedArrayObtainStyledAttributes.getTextArray(index);
            } else if (index == polloi.NumberPickerView_npv_AlternativeTextArrayWithoutMeasureHint) {
                this.f18719preterite = typedArrayObtainStyledAttributes.getTextArray(index);
            } else if (index == polloi.NumberPickerView_npv_RespondChangeOnDetached) {
                this.f18669coffeecake = typedArrayObtainStyledAttributes.getBoolean(index, false);
            } else if (index == polloi.NumberPickerView_npv_RespondChangeInMainThread) {
                this.f18695lerp = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == polloi.NumberPickerView_npv_TextEllipsize) {
                this.f18712peridotite = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == polloi.NumberPickerView_npv_SelectedItemBackground) {
                this.f18707nosophobia = typedArrayObtainStyledAttributes.getDrawable(index);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int rotuma(float f, int i, int i2) {
        int i3 = (i & (-16777216)) >>> 24;
        int i4 = (i & 16711680) >>> 16;
        int i5 = (i & 65280) >>> 8;
        int i6 = i & 255;
        return ((int) (i6 + (((i2 & 255) - i6) * f))) | (((int) (i3 + (((((-16777216) & i2) >>> 24) - i3) * f))) << 24) | (((int) (i4 + ((((16711680 & i2) >>> 16) - i4) * f))) << 16) | (((int) (i5 + ((((65280 & i2) >>> 8) - i5) * f))) << 8);
    }

    public final int saran(int i) {
        int mode = View.MeasureSpec.getMode(i);
        this.f18703molet = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = getPaddingTop() + getPaddingBottom() + (this.f18742yemenite * (this.f18683grimness + (this.f18718preprohormone * 2)));
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public final int sealless(int i) {
        int i2 = this.f18739vesuvio;
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        int i3 = (i / i2) + (this.f18742yemenite / 2);
        int oneRecycleSize = getOneRecycleSize();
        if (this.f18717premeiotic && this.f18735treadless) {
            z = true;
        }
        int iCord = cord(i3, oneRecycleSize, z);
        if (iCord >= 0 && iCord < getOneRecycleSize()) {
            return iCord + this.f18732supplicat;
        }
        throw new IllegalArgumentException("getWillPickIndexByGlobalY illegal index : " + iCord + " getOneRecycleSize() : " + getOneRecycleSize() + " mWrapSelectorWheel : " + this.f18717premeiotic);
    }

    public final boolean seminary(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public void setContentTextTypeface(Typeface typeface) {
        this.f18670coi.setTypeface(typeface);
    }

    public void setDisplayedValues(String[] strArr, boolean z) {
        setDisplayedValuesAndPickedIndex(strArr, 0, z);
    }

    public void setDisplayedValuesAndPickedIndex(String[] strArr, int i, boolean z) {
        overspeculate();
        if (strArr == null) {
            throw new IllegalArgumentException("newDisplayedValues should not be null.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("pickedIndex should not be negative, now pickedIndex is " + i);
        }
        clubfoot(strArr);
        premeiotic(true);
        milliradian();
        treadless();
        this.f18672creditor = this.f18732supplicat + i;
        polloi(i, this.f18717premeiotic && this.f18735treadless);
        if (z) {
            this.f18689igbo.sendMessageDelayed(stratoscope(1), 0L);
            postInvalidate();
        }
    }

    public void setDividerColor(int i) {
        if (this.f18673cuirassed == i) {
            return;
        }
        this.f18673cuirassed = i;
        this.f18680empress.setColor(i);
        postInvalidate();
    }

    public void setFriction(float f) {
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ViewConfiguration.get(getContext());
            this.f18710overspeculate = ViewConfiguration.getScrollFriction() / f;
        } else {
            throw new IllegalArgumentException("you should set a a positive float friction, now friction is " + f);
        }
    }

    public void setHintText(String str) {
        if (seminary(this.f18740walach, str)) {
            return;
        }
        this.f18740walach = str;
        this.f18713permissivist = oilcan(this.f18675czestochowa.getFontMetrics());
        this.f18664adultoid = yemenite(this.f18740walach, this.f18675czestochowa);
        this.f18684gusty.sendEmptyMessage(3);
    }

    public void setHintTextColor(int i) {
        if (this.f18705monoploid == i) {
            return;
        }
        this.f18705monoploid = i;
        this.f18675czestochowa.setColor(i);
        postInvalidate();
    }

    public void setHintTextTypeface(Typeface typeface) {
        this.f18675czestochowa.setTypeface(typeface);
    }

    public void setMaxValue(int i) {
        String[] strArr = this.f18727sensatory;
        if (strArr == null) {
            throw new NullPointerException("mDisplayedValues should not be null");
        }
        int i2 = this.f18701merc;
        if ((i - i2) + 1 > strArr.length) {
            throw new IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + ((i - this.f18701merc) + 1) + " and mDisplayedValues.length is " + this.f18727sensatory.length);
        }
        this.f18715polder = i;
        int i3 = this.f18732supplicat;
        int i4 = (i - i2) + i3;
        this.f18721restrictive = i4;
        setMinAndMaxShowIndex(i3, i4);
        milliradian();
    }

    public void setMinAndMaxShowIndex(int i, int i2) {
        setMinAndMaxShowIndex(i, i2, true);
    }

    public void setMinValue(int i) {
        this.f18701merc = i;
        this.f18732supplicat = 0;
        milliradian();
    }

    public void setNormalTextColor(int i) {
        if (this.f18693kowloon == i) {
            return;
        }
        this.f18693kowloon = i;
        postInvalidate();
    }

    public void setOnValueChangedListener(wireman wiremanVar) {
        this.f18711palmyra = wiremanVar;
    }

    public void setPickedIndexRelativeToMin(int i) {
        if (i < 0 || i >= getOneRecycleSize()) {
            return;
        }
        this.f18672creditor = this.f18732supplicat + i;
        polloi(i, this.f18717premeiotic && this.f18735treadless);
        postInvalidate();
    }

    public void setPickedIndexRelativeToRaw(int i) {
        int i2 = this.f18732supplicat;
        if (i2 <= -1 || i2 > i || i > this.f18721restrictive) {
            return;
        }
        this.f18672creditor = i;
        polloi(i - i2, this.f18717premeiotic && this.f18735treadless);
        postInvalidate();
    }

    public void setSelectedTextColor(int i) {
        if (this.f18665arytenoidectomy == i) {
            return;
        }
        this.f18665arytenoidectomy = i;
        postInvalidate();
    }

    public void setValue(int i) {
        int i2 = this.f18701merc;
        if (i < i2) {
            throw new IllegalArgumentException("should not set a value less than mMinValue, value is " + i);
        }
        if (i <= this.f18715polder) {
            setPickedIndexRelativeToRaw(i - i2);
            return;
        }
        throw new IllegalArgumentException("should not set a value greater than mMaxValue, value is " + i);
    }

    public void setWrapSelectorWheel(boolean z) {
        if (this.f18717premeiotic != z) {
            if (z) {
                this.f18717premeiotic = z;
                coffeecake();
                postInvalidate();
            } else if (this.f18697lightstruck == 0) {
                polder();
            } else {
                this.f18690itchy = true;
            }
        }
    }

    public final void splinterproof() {
        Handler handler = this.f18689igbo;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }

    public final void starveling() {
        VelocityTracker velocityTracker = this.f18724sayid;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f18724sayid.recycle();
            this.f18724sayid = null;
        }
    }

    public final Message stratoscope(int i) {
        return trm(i, 0, 0, null);
    }

    public final void supplicat(Context context) {
        this.f18698lotta = new Scroller(context);
        this.f18730starveling = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        this.f18688hydrovane = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.f18716polloi == 0) {
            this.f18716polloi = mathsort(context, 14.0f);
        }
        if (this.f18704molybdenite == 0) {
            this.f18704molybdenite = mathsort(context, 16.0f);
        }
        if (this.f18682graveside == 0) {
            this.f18682graveside = mathsort(context, 14.0f);
        }
        if (this.f18681gintrap == 0) {
            this.f18681gintrap = molybdenite(context, 8.0f);
        }
        if (this.f18722rotuma == 0) {
            this.f18722rotuma = molybdenite(context, 8.0f);
        }
        this.f18680empress.setColor(this.f18673cuirassed);
        this.f18680empress.setAntiAlias(true);
        this.f18680empress.setStyle(Paint.Style.STROKE);
        this.f18680empress.setStrokeWidth(this.f18731stratoscope);
        this.f18670coi.setColor(this.f18693kowloon);
        this.f18670coi.setAntiAlias(true);
        TextPaint textPaint = this.f18670coi;
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        this.f18670coi.setTypeface(Typeface.defaultFromStyle(1));
        this.f18675czestochowa.setColor(this.f18705monoploid);
        this.f18675czestochowa.setAntiAlias(true);
        this.f18675czestochowa.setTextAlign(align);
        this.f18675czestochowa.setTextSize(this.f18682graveside);
        int i = this.f18742yemenite;
        if (i % 2 == 0) {
            this.f18742yemenite = i + 1;
        }
        if (this.f18732supplicat == -1 || this.f18721restrictive == -1) {
            itchy();
        }
        merc();
    }

    public final void timberyard() {
        float textSize = this.f18670coi.getTextSize();
        this.f18670coi.setTextSize(this.f18704molybdenite);
        this.f18726seminary = cuirassed(this.f18727sensatory, this.f18670coi);
        this.f18723saran = cuirassed(this.f18738underbelly, this.f18670coi);
        this.f18720privatdozent = cuirassed(this.f18719preterite, this.f18670coi);
        this.f18670coi.setTextSize(this.f18682graveside);
        this.f18679dovishness = yemenite(this.f18729splinterproof, this.f18670coi);
        this.f18670coi.setTextSize(textSize);
    }

    public final void treadless() {
        kattegat();
        coffeecake();
        this.f18732supplicat = 0;
        this.f18721restrictive = this.f18727sensatory.length - 1;
    }

    public final void triweekly() {
        int iFloor = (int) Math.floor(this.f18696libyan / this.f18739vesuvio);
        this.f18687homozygous = iFloor;
        this.f18694lampshade = -(this.f18696libyan - (iFloor * this.f18739vesuvio));
    }

    public final Message trm(int i, int i2, int i3, Object obj) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = obj;
        return messageObtain;
    }

    public final void walach(int i) {
        peridotite(i, true);
    }

    public final int yemenite(CharSequence charSequence, Paint paint) {
        Integer num;
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        String string = charSequence.toString();
        if (this.f18714picketboat.containsKey(string) && (num = this.f18714picketboat.get(string)) != null) {
            return num.intValue();
        }
        int iMeasureText = (int) (paint.measureText(string) + 0.5f);
        this.f18714picketboat.put(string, Integer.valueOf(iMeasureText));
        return iMeasureText;
    }

    public void setDisplayedValues(String[] strArr) {
        splinterproof();
        overspeculate();
        if (strArr == null) {
            throw new IllegalArgumentException("newDisplayedValues should not be null.");
        }
        if ((this.f18715polder - this.f18701merc) + 1 <= strArr.length) {
            clubfoot(strArr);
            premeiotic(true);
            this.f18672creditor = this.f18732supplicat;
            polloi(0, this.f18717premeiotic && this.f18735treadless);
            postInvalidate();
            this.f18684gusty.sendEmptyMessage(3);
            return;
        }
        throw new IllegalArgumentException("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is " + ((this.f18715polder - this.f18701merc) + 1) + " newDisplayedValues.length is " + strArr.length + ", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
    }

    public void setMinAndMaxShowIndex(int i, int i2, boolean z) {
        if (i > i2) {
            throw new IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + i + ", maxShowIndex is " + i2 + ".");
        }
        String[] strArr = this.f18727sensatory;
        if (strArr == null) {
            throw new IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is " + i);
        }
        if (i > strArr.length - 1) {
            throw new IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f18727sensatory.length - 1) + " minShowIndex is " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is " + i2);
        }
        if (i2 > strArr.length - 1) {
            throw new IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f18727sensatory.length - 1) + " maxShowIndex is " + i2);
        }
        this.f18732supplicat = i;
        this.f18721restrictive = i2;
        if (z) {
            this.f18672creditor = i;
            polloi(0, this.f18717premeiotic && this.f18735treadless);
            postInvalidate();
        }
    }

    public void setOnScrollListener(dern dernVar) {
    }

    public void setOnValueChangeListenerInScrolling(marial marialVar) {
    }

    public void setOnValueChangedListenerRelativeToRaw(beachfront beachfrontVar) {
    }

    public NumberPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18693kowloon = -13421773;
        this.f18665arytenoidectomy = -695533;
        this.f18705monoploid = -695533;
        this.f18716polloi = 0;
        this.f18704molybdenite = 0;
        this.f18682graveside = 0;
        this.f18664adultoid = 0;
        this.f18679dovishness = 0;
        this.f18681gintrap = 0;
        this.f18722rotuma = 0;
        this.f18718preprohormone = 0;
        this.f18671cord = 0;
        this.f18673cuirassed = -695533;
        this.f18731stratoscope = 2;
        this.f18736trm = 0;
        this.f18708oilcan = 0;
        this.f18742yemenite = 3;
        this.f18725sealless = 0;
        this.f18692kattegat = 0;
        this.f18732supplicat = -1;
        this.f18721restrictive = -1;
        this.f18701merc = 0;
        this.f18715polder = 0;
        this.f18726seminary = 0;
        this.f18683grimness = 0;
        this.f18723saran = 0;
        this.f18720privatdozent = 0;
        this.f18672creditor = 0;
        this.f18730starveling = Opcodes.FCMPG;
        this.f18688hydrovane = 8;
        this.f18710overspeculate = 1.0f;
        this.f18668clubfoot = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18677dent = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18713permissivist = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18674cultivated = true;
        this.f18717premeiotic = true;
        this.f18734timberyard = false;
        this.f18702milliradian = false;
        this.f18735treadless = true;
        this.f18690itchy = false;
        this.f18669coffeecake = false;
        this.f18695lerp = true;
        this.f18707nosophobia = null;
        this.f18680empress = new Paint();
        this.f18670coi = new TextPaint();
        this.f18675czestochowa = new Paint();
        this.f18714picketboat = new ConcurrentHashMap();
        this.f18697lightstruck = 0;
        this.f18667claque = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18685hardpan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18686herdbook = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18733technofreak = false;
        this.f18687homozygous = 0;
        this.f18694lampshade = 0;
        this.f18696libyan = 0;
        this.f18676deadwork = 0;
        this.f18703molet = 0;
        restrictive(context, attributeSet);
        supplicat(context);
    }

    public NumberPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18693kowloon = -13421773;
        this.f18665arytenoidectomy = -695533;
        this.f18705monoploid = -695533;
        this.f18716polloi = 0;
        this.f18704molybdenite = 0;
        this.f18682graveside = 0;
        this.f18664adultoid = 0;
        this.f18679dovishness = 0;
        this.f18681gintrap = 0;
        this.f18722rotuma = 0;
        this.f18718preprohormone = 0;
        this.f18671cord = 0;
        this.f18673cuirassed = -695533;
        this.f18731stratoscope = 2;
        this.f18736trm = 0;
        this.f18708oilcan = 0;
        this.f18742yemenite = 3;
        this.f18725sealless = 0;
        this.f18692kattegat = 0;
        this.f18732supplicat = -1;
        this.f18721restrictive = -1;
        this.f18701merc = 0;
        this.f18715polder = 0;
        this.f18726seminary = 0;
        this.f18683grimness = 0;
        this.f18723saran = 0;
        this.f18720privatdozent = 0;
        this.f18672creditor = 0;
        this.f18730starveling = Opcodes.FCMPG;
        this.f18688hydrovane = 8;
        this.f18710overspeculate = 1.0f;
        this.f18668clubfoot = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18677dent = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18713permissivist = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18674cultivated = true;
        this.f18717premeiotic = true;
        this.f18734timberyard = false;
        this.f18702milliradian = false;
        this.f18735treadless = true;
        this.f18690itchy = false;
        this.f18669coffeecake = false;
        this.f18695lerp = true;
        this.f18707nosophobia = null;
        this.f18680empress = new Paint();
        this.f18670coi = new TextPaint();
        this.f18675czestochowa = new Paint();
        this.f18714picketboat = new ConcurrentHashMap();
        this.f18697lightstruck = 0;
        this.f18667claque = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18685hardpan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18686herdbook = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f18733technofreak = false;
        this.f18687homozygous = 0;
        this.f18694lampshade = 0;
        this.f18696libyan = 0;
        this.f18676deadwork = 0;
        this.f18703molet = 0;
        restrictive(context, attributeSet);
        supplicat(context);
    }
}
