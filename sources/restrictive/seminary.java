package restrictive;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import com.ironsource.X3;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: AndroidPaint.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\n\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000e\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\r\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u0013*\u00060\u0003j\u0002`\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\"\u0010\u0016\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\r\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\"\u0010\u0019\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\r\u001a\u00020\u0018H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u000b\u001a\u0017\u0010\u001a\u001a\u00020\u0010*\u00060\u0003j\u0002`\u0006H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001c\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\r\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u0012\u001a\u0017\u0010\u001e\u001a\u00020\u001d*\u00060\u0003j\u0002`\u0006H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\"\u0010 \u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\r\u001a\u00020\u001dH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010\u000b\u001a\u0017\u0010\"\u001a\u00020!*\u00060\u0003j\u0002`\u0006H\u0000¢\u0006\u0004\b\"\u0010\u001f\u001a\"\u0010#\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\r\u001a\u00020!H\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010\u000b\u001a\u0017\u0010$\u001a\u00020\u0010*\u00060\u0003j\u0002`\u0006H\u0000¢\u0006\u0004\b$\u0010\u001b\u001a\u001f\u0010%\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\r\u001a\u00020\u0010H\u0000¢\u0006\u0004\b%\u0010\u0012\u001a\u0017\u0010'\u001a\u00020&*\u00060\u0003j\u0002`\u0006H\u0000¢\u0006\u0004\b'\u0010\u001f\u001a\"\u0010(\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u0006\u0010\r\u001a\u00020&H\u0000ø\u0001\u0000¢\u0006\u0004\b(\u0010\u000b\u001a'\u0010+\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\u000e\u0010\r\u001a\n\u0018\u00010)j\u0004\u0018\u0001`*H\u0000¢\u0006\u0004\b+\u0010,\u001a!\u0010.\u001a\u00020\t*\u00060\u0003j\u0002`\u00062\b\u0010\r\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0004\b.\u0010/*\n\u00100\"\u00020\u00032\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Lrestrictive/lotta;", "attabal", "()Lrestrictive/lotta;", "Landroid/graphics/Paint;", "impromptu", "()Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "Lrestrictive/saran;", X3.a.t, "", "cutely", "(Landroid/graphics/Paint;I)V", "Lrestrictive/clubfoot;", "value", "formularize", "(Landroid/graphics/Paint;Lrestrictive/clubfoot;)V", "", "taiyuan", "(Landroid/graphics/Paint;F)V", "Lrestrictive/overspeculate;", "saneness", "(Landroid/graphics/Paint;)J", "apical", "(Landroid/graphics/Paint;J)V", "Lrestrictive/sayid;", "graveside", "competently", "(Landroid/graphics/Paint;)F", "molybdenite", "Lrestrictive/igbo;", "wireman", "(Landroid/graphics/Paint;)I", "arytenoidectomy", "Lrestrictive/gusty;", "marial", "monoploid", "beachfront", "polloi", "Lrestrictive/cultivated;", "dern", "impassible", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "kowloon", "(Landroid/graphics/Paint;Landroid/graphics/Shader;)V", "Lrestrictive/empress;", "triweekly", "(Landroid/graphics/Paint;Lrestrictive/empress;)V", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class seminary {

    /* JADX INFO: compiled from: AndroidPaint.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f36349attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final /* synthetic */ int[] f36350dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f36351saneness;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f36349attabal = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f36351saneness = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f36350dern = iArr3;
        }
    }

    public static final void apical(Paint paint, long j) {
        paint.setColor(dent.wireman(j));
    }

    public static final void arytenoidectomy(Paint paint, int i) {
        Paint.Cap cap;
        igbo.Companion companion = igbo.INSTANCE;
        if (igbo.beachfront(i, companion.dern())) {
            cap = Paint.Cap.SQUARE;
        } else if (igbo.beachfront(i, companion.saneness())) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = igbo.beachfront(i, companion.attabal()) ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final lotta attabal() {
        return new polder();
    }

    public static final float beachfront(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float competently(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final void cutely(Paint paint, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            monroe.f36274attabal.attabal(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(oilcan.saneness(i)));
        }
    }

    public static final int dern(Paint paint) {
        return !paint.isFilterBitmap() ? cultivated.INSTANCE.saneness() : cultivated.INSTANCE.attabal();
    }

    public static final void formularize(Paint paint, clubfoot clubfootVar) {
        paint.setColorFilter(null);
    }

    public static final void graveside(Paint paint, int i) {
        paint.setStyle(sayid.marial(i, sayid.INSTANCE.saneness()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public static final void impassible(Paint paint, int i) {
        paint.setFilterBitmap(!cultivated.marial(i, cultivated.INSTANCE.saneness()));
    }

    public static final Paint impromptu() {
        return new Paint(7);
    }

    public static final void kowloon(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final int marial(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : attabal.f36350dern[strokeJoin.ordinal()];
        if (i == 1) {
            return gusty.INSTANCE.saneness();
        }
        if (i != 2) {
            return i != 3 ? gusty.INSTANCE.saneness() : gusty.INSTANCE.dern();
        }
        return gusty.INSTANCE.attabal();
    }

    public static final void molybdenite(Paint paint, float f) {
        paint.setStrokeWidth(f);
    }

    public static final void monoploid(Paint paint, int i) {
        Paint.Join join;
        gusty.Companion companion = gusty.INSTANCE;
        if (gusty.beachfront(i, companion.saneness())) {
            join = Paint.Join.MITER;
        } else if (gusty.beachfront(i, companion.attabal())) {
            join = Paint.Join.BEVEL;
        } else {
            join = gusty.beachfront(i, companion.dern()) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void polloi(Paint paint, float f) {
        paint.setStrokeMiter(f);
    }

    public static final long saneness(Paint paint) {
        return dent.saneness(paint.getColor());
    }

    public static final void taiyuan(Paint paint, float f) {
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void triweekly(Paint paint, empress empressVar) {
        grimness grimnessVar = (grimness) empressVar;
        paint.setPathEffect(grimnessVar != null ? grimnessVar.getNativePathEffect() : null);
    }

    public static final int wireman(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : attabal.f36351saneness[strokeCap.ordinal()];
        if (i == 1) {
            return igbo.INSTANCE.attabal();
        }
        if (i != 2) {
            return i != 3 ? igbo.INSTANCE.attabal() : igbo.INSTANCE.dern();
        }
        return igbo.INSTANCE.saneness();
    }
}
