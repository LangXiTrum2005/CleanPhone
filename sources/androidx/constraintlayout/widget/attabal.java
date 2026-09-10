package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: ConstraintSet.java */
/* JADX INFO: loaded from: classes.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public boolean f8924attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public String f8930saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final int[] f8923taiyuan = {0, 4, 8};

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static SparseIntArray f8922cutely = new SparseIntArray();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static SparseIntArray f8921apical = new SparseIntArray();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public String f8927dern = "";

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public String[] f8931wireman = new String[0];

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f8929marial = 0;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public HashMap<String, ConstraintAttribute> f8925beachfront = new HashMap<>();

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public boolean f8926competently = true;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public HashMap<Integer, C0056attabal> f8928impromptu = new HashMap<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class C0056attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public int f8932attabal;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public C0057attabal f8936impromptu;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public String f8938saneness;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final wireman f8935dern = new wireman();

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final dern f8939wireman = new dern();

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final saneness f8937marial = new saneness();

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public final marial f8933beachfront = new marial();

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public HashMap<String, ConstraintAttribute> f8934competently = new HashMap<>();

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.attabal$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ConstraintSet.java */
        public static class C0057attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public int[] f8941attabal = new int[10];

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public int[] f8949saneness = new int[10];

            /* JADX INFO: renamed from: dern, reason: collision with root package name */
            public int f8945dern = 0;

            /* JADX INFO: renamed from: wireman, reason: collision with root package name */
            public int[] f8951wireman = new int[10];

            /* JADX INFO: renamed from: marial, reason: collision with root package name */
            public float[] f8948marial = new float[10];

            /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
            public int f8942beachfront = 0;

            /* JADX INFO: renamed from: competently, reason: collision with root package name */
            public int[] f8943competently = new int[5];

            /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
            public String[] f8947impromptu = new String[5];

            /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
            public int f8950taiyuan = 0;

            /* JADX INFO: renamed from: cutely, reason: collision with root package name */
            public int[] f8944cutely = new int[4];

            /* JADX INFO: renamed from: apical, reason: collision with root package name */
            public boolean[] f8940apical = new boolean[4];

            /* JADX INFO: renamed from: formularize, reason: collision with root package name */
            public int f8946formularize = 0;

            public void attabal(int i, float f) {
                int i2 = this.f8942beachfront;
                int[] iArr = this.f8951wireman;
                if (i2 >= iArr.length) {
                    this.f8951wireman = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f8948marial;
                    this.f8948marial = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f8951wireman;
                int i3 = this.f8942beachfront;
                iArr2[i3] = i;
                float[] fArr2 = this.f8948marial;
                this.f8942beachfront = i3 + 1;
                fArr2[i3] = f;
            }

            public void dern(int i, String str) {
                int i2 = this.f8950taiyuan;
                int[] iArr = this.f8943competently;
                if (i2 >= iArr.length) {
                    this.f8943competently = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f8947impromptu;
                    this.f8947impromptu = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f8943competently;
                int i3 = this.f8950taiyuan;
                iArr2[i3] = i;
                String[] strArr2 = this.f8947impromptu;
                this.f8950taiyuan = i3 + 1;
                strArr2[i3] = str;
            }

            public void marial(C0056attabal c0056attabal) {
                for (int i = 0; i < this.f8945dern; i++) {
                    attabal.saran(c0056attabal, this.f8941attabal[i], this.f8949saneness[i]);
                }
                for (int i2 = 0; i2 < this.f8942beachfront; i2++) {
                    attabal.grimness(c0056attabal, this.f8951wireman[i2], this.f8948marial[i2]);
                }
                for (int i3 = 0; i3 < this.f8950taiyuan; i3++) {
                    attabal.privatdozent(c0056attabal, this.f8943competently[i3], this.f8947impromptu[i3]);
                }
                for (int i4 = 0; i4 < this.f8946formularize; i4++) {
                    attabal.creditor(c0056attabal, this.f8944cutely[i4], this.f8940apical[i4]);
                }
            }

            public void saneness(int i, int i2) {
                int i3 = this.f8945dern;
                int[] iArr = this.f8941attabal;
                if (i3 >= iArr.length) {
                    this.f8941attabal = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f8949saneness;
                    this.f8949saneness = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f8941attabal;
                int i4 = this.f8945dern;
                iArr3[i4] = i;
                int[] iArr4 = this.f8949saneness;
                this.f8945dern = i4 + 1;
                iArr4[i4] = i2;
            }

            public void wireman(int i, boolean z) {
                int i2 = this.f8946formularize;
                int[] iArr = this.f8944cutely;
                if (i2 >= iArr.length) {
                    this.f8944cutely = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f8940apical;
                    this.f8940apical = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f8944cutely;
                int i3 = this.f8946formularize;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f8940apical;
                this.f8946formularize = i3 + 1;
                zArr2[i3] = z;
            }
        }

        /* JADX INFO: renamed from: beachfront, reason: merged with bridge method [inline-methods] */
        public C0056attabal clone() {
            C0056attabal c0056attabal = new C0056attabal();
            c0056attabal.f8937marial.attabal(this.f8937marial);
            c0056attabal.f8939wireman.attabal(this.f8939wireman);
            c0056attabal.f8935dern.attabal(this.f8935dern);
            c0056attabal.f8933beachfront.attabal(this.f8933beachfront);
            c0056attabal.f8932attabal = this.f8932attabal;
            c0056attabal.f8936impromptu = this.f8936impromptu;
            return c0056attabal;
        }

        public final void competently(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f8932attabal = i;
            saneness sanenessVar = this.f8937marial;
            sanenessVar.f8996cutely = layoutParams.f8846marial;
            sanenessVar.f8984apical = layoutParams.f8816beachfront;
            sanenessVar.f9002formularize = layoutParams.f8820competently;
            sanenessVar.f9007impassible = layoutParams.f8839impromptu;
            sanenessVar.f9046triweekly = layoutParams.f8877taiyuan;
            sanenessVar.f9011kowloon = layoutParams.f8825cutely;
            sanenessVar.f8985arytenoidectomy = layoutParams.f8813apical;
            sanenessVar.f9019monoploid = layoutParams.f8831formularize;
            sanenessVar.f9026polloi = layoutParams.f8838impassible;
            sanenessVar.f9018molybdenite = layoutParams.f8880triweekly;
            sanenessVar.f9004graveside = layoutParams.f8842kowloon;
            sanenessVar.f8983adultoid = layoutParams.f8850molybdenite;
            sanenessVar.f9000dovishness = layoutParams.f8833graveside;
            sanenessVar.f9003gintrap = layoutParams.f8812adultoid;
            sanenessVar.f9032rotuma = layoutParams.f8829dovishness;
            sanenessVar.f9028preprohormone = layoutParams.f8841kattegat;
            sanenessVar.f8992cord = layoutParams.f8876supplicat;
            sanenessVar.f8994cuirassed = layoutParams.f8865restrictive;
            sanenessVar.f9041stratoscope = layoutParams.f8814arytenoidectomy;
            sanenessVar.f9047trm = layoutParams.f8851monoploid;
            sanenessVar.f9021oilcan = layoutParams.f8860polloi;
            sanenessVar.f9051yemenite = layoutParams.f8817clubfoot;
            sanenessVar.f9036sealless = layoutParams.f8827dent;
            sanenessVar.f9010kattegat = layoutParams.f8857permissivist;
            sanenessVar.f9008impromptu = layoutParams.f8828dern;
            sanenessVar.f8987beachfront = layoutParams.f8815attabal;
            sanenessVar.f8991competently = layoutParams.f8867saneness;
            sanenessVar.f9050wireman = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            sanenessVar.f9014marial = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            sanenessVar.f9042supplicat = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            sanenessVar.f9031restrictive = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            sanenessVar.f9016merc = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            sanenessVar.f9025polder = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            sanenessVar.f9034saran = layoutParams.f8853oilcan;
            sanenessVar.f9039splinterproof = layoutParams.f8834grimness;
            sanenessVar.f9022overspeculate = layoutParams.f8871seminary;
            sanenessVar.f8998dent = layoutParams.f8864privatdozent;
            sanenessVar.f8988clubfoot = layoutParams.f8868saran;
            sanenessVar.f8997czestochowa = layoutParams.f8824cultivated;
            sanenessVar.f9038sensatory = layoutParams.f8861premeiotic;
            sanenessVar.f9024permissivist = layoutParams.f8822creditor;
            sanenessVar.f8995cultivated = layoutParams.f8874starveling;
            sanenessVar.f9027premeiotic = layoutParams.f8856peridotite;
            sanenessVar.f9044timberyard = layoutParams.f8847mathsort;
            sanenessVar.f9017milliradian = layoutParams.f8836hydrovane;
            sanenessVar.f9045treadless = layoutParams.f8883walach;
            sanenessVar.f9009itchy = layoutParams.f8873splinterproof;
            sanenessVar.f8989coffeecake = layoutParams.f8854overspeculate;
            sanenessVar.f8990coi = layoutParams.f8878timberyard;
            sanenessVar.f8993creditor = layoutParams.f8866rotuma;
            sanenessVar.f9006hydrovane = layoutParams.f8821cord;
            sanenessVar.f9030privatdozent = layoutParams.f8832gintrap;
            sanenessVar.f9040starveling = layoutParams.f8862preprohormone;
            sanenessVar.f9023peridotite = layoutParams.f8823cuirassed;
            sanenessVar.f9049walach = layoutParams.f8875stratoscope;
            sanenessVar.f9015mathsort = layoutParams.f8881trm;
            sanenessVar.f9029preterite = layoutParams.f8849milliradian;
            sanenessVar.f9037seminary = layoutParams.getMarginEnd();
            this.f8937marial.f9005grimness = layoutParams.getMarginStart();
        }

        public final void impromptu(int i, Constraints.LayoutParams layoutParams) {
            competently(i, layoutParams);
            this.f8935dern.f9056wireman = layoutParams.f8905monroe;
            marial marialVar = this.f8933beachfront;
            marialVar.f8978saneness = layoutParams.f8909unconsolidated;
            marialVar.f8973dern = layoutParams.f8899claque;
            marialVar.f8981wireman = layoutParams.f8901hardpan;
            marialVar.f8977marial = layoutParams.f8902herdbook;
            marialVar.f8970beachfront = layoutParams.f8908technofreak;
            marialVar.f8971competently = layoutParams.f8906outmarry;
            marialVar.f8976impromptu = layoutParams.f8900dhss;
            marialVar.f8972cutely = layoutParams.f8910vesuvio;
            marialVar.f8968apical = layoutParams.f8907setterwort;
            marialVar.f8974formularize = layoutParams.f8904mastfed;
            marialVar.f8980triweekly = layoutParams.f8898achondroplasia;
            marialVar.f8975impassible = layoutParams.f8903julian;
        }

        public void marial(ConstraintLayout.LayoutParams layoutParams) {
            saneness sanenessVar = this.f8937marial;
            layoutParams.f8846marial = sanenessVar.f8996cutely;
            layoutParams.f8816beachfront = sanenessVar.f8984apical;
            layoutParams.f8820competently = sanenessVar.f9002formularize;
            layoutParams.f8839impromptu = sanenessVar.f9007impassible;
            layoutParams.f8877taiyuan = sanenessVar.f9046triweekly;
            layoutParams.f8825cutely = sanenessVar.f9011kowloon;
            layoutParams.f8813apical = sanenessVar.f8985arytenoidectomy;
            layoutParams.f8831formularize = sanenessVar.f9019monoploid;
            layoutParams.f8838impassible = sanenessVar.f9026polloi;
            layoutParams.f8880triweekly = sanenessVar.f9018molybdenite;
            layoutParams.f8842kowloon = sanenessVar.f9004graveside;
            layoutParams.f8850molybdenite = sanenessVar.f8983adultoid;
            layoutParams.f8833graveside = sanenessVar.f9000dovishness;
            layoutParams.f8812adultoid = sanenessVar.f9003gintrap;
            layoutParams.f8829dovishness = sanenessVar.f9032rotuma;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = sanenessVar.f9042supplicat;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = sanenessVar.f9031restrictive;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = sanenessVar.f9016merc;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = sanenessVar.f9025polder;
            layoutParams.f8823cuirassed = sanenessVar.f9023peridotite;
            layoutParams.f8875stratoscope = sanenessVar.f9049walach;
            layoutParams.f8866rotuma = sanenessVar.f8993creditor;
            layoutParams.f8821cord = sanenessVar.f9006hydrovane;
            layoutParams.f8841kattegat = sanenessVar.f9028preprohormone;
            layoutParams.f8876supplicat = sanenessVar.f8992cord;
            layoutParams.f8814arytenoidectomy = sanenessVar.f9041stratoscope;
            layoutParams.f8851monoploid = sanenessVar.f9047trm;
            layoutParams.f8860polloi = sanenessVar.f9021oilcan;
            layoutParams.f8865restrictive = sanenessVar.f8994cuirassed;
            layoutParams.f8817clubfoot = sanenessVar.f9051yemenite;
            layoutParams.f8827dent = sanenessVar.f9036sealless;
            layoutParams.f8834grimness = sanenessVar.f9039splinterproof;
            layoutParams.f8871seminary = sanenessVar.f9022overspeculate;
            layoutParams.f8864privatdozent = sanenessVar.f8998dent;
            layoutParams.f8868saran = sanenessVar.f8988clubfoot;
            layoutParams.f8824cultivated = sanenessVar.f8997czestochowa;
            layoutParams.f8861premeiotic = sanenessVar.f9038sensatory;
            layoutParams.f8822creditor = sanenessVar.f9024permissivist;
            layoutParams.f8874starveling = sanenessVar.f8995cultivated;
            layoutParams.f8856peridotite = sanenessVar.f9027premeiotic;
            layoutParams.f8847mathsort = sanenessVar.f9044timberyard;
            layoutParams.f8836hydrovane = sanenessVar.f9017milliradian;
            layoutParams.f8883walach = sanenessVar.f9045treadless;
            layoutParams.f8873splinterproof = sanenessVar.f9009itchy;
            layoutParams.f8854overspeculate = sanenessVar.f8989coffeecake;
            layoutParams.f8857permissivist = sanenessVar.f9010kattegat;
            layoutParams.f8828dern = sanenessVar.f9008impromptu;
            layoutParams.f8815attabal = sanenessVar.f8987beachfront;
            layoutParams.f8867saneness = sanenessVar.f8991competently;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = sanenessVar.f9050wireman;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = sanenessVar.f9014marial;
            String str = sanenessVar.f8990coi;
            if (str != null) {
                layoutParams.f8878timberyard = str;
            }
            layoutParams.f8849milliradian = sanenessVar.f9029preterite;
            layoutParams.setMarginStart(sanenessVar.f9005grimness);
            layoutParams.setMarginEnd(this.f8937marial.f9037seminary);
            layoutParams.dern();
        }

        public final void taiyuan(ConstraintHelper constraintHelper, int i, Constraints.LayoutParams layoutParams) {
            impromptu(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                saneness sanenessVar = this.f8937marial;
                sanenessVar.f9013lotta = 1;
                Barrier barrier = (Barrier) constraintHelper;
                sanenessVar.f9012lerp = barrier.getType();
                this.f8937marial.f9035sayid = barrier.getReferencedIds();
                this.f8937marial.f9020nosophobia = barrier.getMargin();
            }
        }

        public void wireman(C0056attabal c0056attabal) {
            C0057attabal c0057attabal = this.f8936impromptu;
            if (c0057attabal != null) {
                c0057attabal.marial(c0056attabal);
            }
        }
    }

    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class dern {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static SparseIntArray f8952kowloon;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f8954attabal = false;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f8963saneness = -1;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f8958dern = 0;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public String f8966wireman = null;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f8962marial = -1;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f8955beachfront = 0;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public float f8956competently = Float.NaN;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f8961impromptu = -1;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public float f8964taiyuan = Float.NaN;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public float f8957cutely = Float.NaN;

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public int f8953apical = -1;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public String f8959formularize = null;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public int f8960impassible = -3;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public int f8965triweekly = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8952kowloon = sparseIntArray;
            sparseIntArray.append(sensatory.wireman.Motion_motionPathRotate, 1);
            f8952kowloon.append(sensatory.wireman.Motion_pathMotionArc, 2);
            f8952kowloon.append(sensatory.wireman.Motion_transitionEasing, 3);
            f8952kowloon.append(sensatory.wireman.Motion_drawPath, 4);
            f8952kowloon.append(sensatory.wireman.Motion_animateRelativeTo, 5);
            f8952kowloon.append(sensatory.wireman.Motion_animateCircleAngleTo, 6);
            f8952kowloon.append(sensatory.wireman.Motion_motionStagger, 7);
            f8952kowloon.append(sensatory.wireman.Motion_quantizeMotionSteps, 8);
            f8952kowloon.append(sensatory.wireman.Motion_quantizeMotionPhase, 9);
            f8952kowloon.append(sensatory.wireman.Motion_quantizeMotionInterpolator, 10);
        }

        public void attabal(dern dernVar) {
            this.f8954attabal = dernVar.f8954attabal;
            this.f8963saneness = dernVar.f8963saneness;
            this.f8966wireman = dernVar.f8966wireman;
            this.f8962marial = dernVar.f8962marial;
            this.f8955beachfront = dernVar.f8955beachfront;
            this.f8964taiyuan = dernVar.f8964taiyuan;
            this.f8956competently = dernVar.f8956competently;
            this.f8961impromptu = dernVar.f8961impromptu;
        }

        public void saneness(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sensatory.wireman.Motion);
            this.f8954attabal = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f8952kowloon.get(index)) {
                    case 1:
                        this.f8964taiyuan = typedArrayObtainStyledAttributes.getFloat(index, this.f8964taiyuan);
                        break;
                    case 2:
                        this.f8962marial = typedArrayObtainStyledAttributes.getInt(index, this.f8962marial);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f8966wireman = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f8966wireman = lerp.dern.f32794dern[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f8955beachfront = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f8963saneness = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f8963saneness);
                        break;
                    case 6:
                        this.f8958dern = typedArrayObtainStyledAttributes.getInteger(index, this.f8958dern);
                        break;
                    case 7:
                        this.f8956competently = typedArrayObtainStyledAttributes.getFloat(index, this.f8956competently);
                        break;
                    case 8:
                        this.f8953apical = typedArrayObtainStyledAttributes.getInteger(index, this.f8953apical);
                        break;
                    case 9:
                        this.f8957cutely = typedArrayObtainStyledAttributes.getFloat(index, this.f8957cutely);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f8965triweekly = resourceId;
                            if (resourceId != -1) {
                                this.f8960impassible = -2;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f8959formularize = string;
                            if (string.indexOf("/") > 0) {
                                this.f8965triweekly = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f8960impassible = -2;
                            } else {
                                this.f8960impassible = -1;
                            }
                        } else {
                            this.f8960impassible = typedArrayObtainStyledAttributes.getInteger(index, this.f8965triweekly);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class marial {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static SparseIntArray f8967kowloon;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f8969attabal = false;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public float f8978saneness = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public float f8973dern = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public float f8981wireman = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public float f8977marial = 1.0f;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public float f8970beachfront = 1.0f;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public float f8971competently = Float.NaN;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public float f8976impromptu = Float.NaN;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public int f8979taiyuan = -1;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public float f8972cutely = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public float f8968apical = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public float f8974formularize = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public boolean f8975impassible = false;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public float f8980triweekly = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8967kowloon = sparseIntArray;
            sparseIntArray.append(sensatory.wireman.Transform_android_rotation, 1);
            f8967kowloon.append(sensatory.wireman.Transform_android_rotationX, 2);
            f8967kowloon.append(sensatory.wireman.Transform_android_rotationY, 3);
            f8967kowloon.append(sensatory.wireman.Transform_android_scaleX, 4);
            f8967kowloon.append(sensatory.wireman.Transform_android_scaleY, 5);
            f8967kowloon.append(sensatory.wireman.Transform_android_transformPivotX, 6);
            f8967kowloon.append(sensatory.wireman.Transform_android_transformPivotY, 7);
            f8967kowloon.append(sensatory.wireman.Transform_android_translationX, 8);
            f8967kowloon.append(sensatory.wireman.Transform_android_translationY, 9);
            f8967kowloon.append(sensatory.wireman.Transform_android_translationZ, 10);
            f8967kowloon.append(sensatory.wireman.Transform_android_elevation, 11);
            f8967kowloon.append(sensatory.wireman.Transform_transformPivotTarget, 12);
        }

        public void attabal(marial marialVar) {
            this.f8969attabal = marialVar.f8969attabal;
            this.f8978saneness = marialVar.f8978saneness;
            this.f8973dern = marialVar.f8973dern;
            this.f8981wireman = marialVar.f8981wireman;
            this.f8977marial = marialVar.f8977marial;
            this.f8970beachfront = marialVar.f8970beachfront;
            this.f8971competently = marialVar.f8971competently;
            this.f8976impromptu = marialVar.f8976impromptu;
            this.f8979taiyuan = marialVar.f8979taiyuan;
            this.f8972cutely = marialVar.f8972cutely;
            this.f8968apical = marialVar.f8968apical;
            this.f8974formularize = marialVar.f8974formularize;
            this.f8975impassible = marialVar.f8975impassible;
            this.f8980triweekly = marialVar.f8980triweekly;
        }

        public void saneness(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sensatory.wireman.Transform);
            this.f8969attabal = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f8967kowloon.get(index)) {
                    case 1:
                        this.f8978saneness = typedArrayObtainStyledAttributes.getFloat(index, this.f8978saneness);
                        break;
                    case 2:
                        this.f8973dern = typedArrayObtainStyledAttributes.getFloat(index, this.f8973dern);
                        break;
                    case 3:
                        this.f8981wireman = typedArrayObtainStyledAttributes.getFloat(index, this.f8981wireman);
                        break;
                    case 4:
                        this.f8977marial = typedArrayObtainStyledAttributes.getFloat(index, this.f8977marial);
                        break;
                    case 5:
                        this.f8970beachfront = typedArrayObtainStyledAttributes.getFloat(index, this.f8970beachfront);
                        break;
                    case 6:
                        this.f8971competently = typedArrayObtainStyledAttributes.getDimension(index, this.f8971competently);
                        break;
                    case 7:
                        this.f8976impromptu = typedArrayObtainStyledAttributes.getDimension(index, this.f8976impromptu);
                        break;
                    case 8:
                        this.f8972cutely = typedArrayObtainStyledAttributes.getDimension(index, this.f8972cutely);
                        break;
                    case 9:
                        this.f8968apical = typedArrayObtainStyledAttributes.getDimension(index, this.f8968apical);
                        break;
                    case 10:
                        this.f8974formularize = typedArrayObtainStyledAttributes.getDimension(index, this.f8974formularize);
                        break;
                    case 11:
                        this.f8975impassible = true;
                        this.f8980triweekly = typedArrayObtainStyledAttributes.getDimension(index, this.f8980triweekly);
                        break;
                    case 12:
                        this.f8979taiyuan = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f8979taiyuan);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class saneness {

        /* JADX INFO: renamed from: wostteth, reason: collision with root package name */
        public static SparseIntArray f8982wostteth;

        /* JADX INFO: renamed from: coi, reason: collision with root package name */
        public String f8990coi;

        /* JADX INFO: renamed from: empress, reason: collision with root package name */
        public String f9001empress;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public int f9014marial;

        /* JADX INFO: renamed from: sayid, reason: collision with root package name */
        public int[] f9035sayid;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public int f9050wireman;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f8986attabal = false;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public boolean f9033saneness = false;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public boolean f8999dern = false;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public int f8987beachfront = -1;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public int f8991competently = -1;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public float f9008impromptu = -1.0f;

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public boolean f9043taiyuan = true;

        /* JADX INFO: renamed from: cutely, reason: collision with root package name */
        public int f8996cutely = -1;

        /* JADX INFO: renamed from: apical, reason: collision with root package name */
        public int f8984apical = -1;

        /* JADX INFO: renamed from: formularize, reason: collision with root package name */
        public int f9002formularize = -1;

        /* JADX INFO: renamed from: impassible, reason: collision with root package name */
        public int f9007impassible = -1;

        /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
        public int f9046triweekly = -1;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public int f9011kowloon = -1;

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public int f8985arytenoidectomy = -1;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f9019monoploid = -1;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public int f9026polloi = -1;

        /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
        public int f9018molybdenite = -1;

        /* JADX INFO: renamed from: graveside, reason: collision with root package name */
        public int f9004graveside = -1;

        /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
        public int f8983adultoid = -1;

        /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
        public int f9000dovishness = -1;

        /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
        public int f9003gintrap = -1;

        /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
        public int f9032rotuma = -1;

        /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
        public float f9028preprohormone = 0.5f;

        /* JADX INFO: renamed from: cord, reason: collision with root package name */
        public float f8992cord = 0.5f;

        /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
        public String f8994cuirassed = null;

        /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
        public int f9041stratoscope = -1;

        /* JADX INFO: renamed from: trm, reason: collision with root package name */
        public int f9047trm = 0;

        /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
        public float f9021oilcan = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
        public int f9051yemenite = -1;

        /* JADX INFO: renamed from: sealless, reason: collision with root package name */
        public int f9036sealless = -1;

        /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
        public int f9010kattegat = -1;

        /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
        public int f9042supplicat = 0;

        /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
        public int f9031restrictive = 0;

        /* JADX INFO: renamed from: merc, reason: collision with root package name */
        public int f9016merc = 0;

        /* JADX INFO: renamed from: polder, reason: collision with root package name */
        public int f9025polder = 0;

        /* JADX INFO: renamed from: seminary, reason: collision with root package name */
        public int f9037seminary = 0;

        /* JADX INFO: renamed from: grimness, reason: collision with root package name */
        public int f9005grimness = 0;

        /* JADX INFO: renamed from: saran, reason: collision with root package name */
        public int f9034saran = 0;

        /* JADX INFO: renamed from: privatdozent, reason: collision with root package name */
        public int f9030privatdozent = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: creditor, reason: collision with root package name */
        public int f8993creditor = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: starveling, reason: collision with root package name */
        public int f9040starveling = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
        public int f9006hydrovane = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: walach, reason: collision with root package name */
        public int f9049walach = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
        public int f9023peridotite = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
        public int f9015mathsort = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
        public float f9039splinterproof = -1.0f;

        /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
        public float f9022overspeculate = -1.0f;

        /* JADX INFO: renamed from: clubfoot, reason: collision with root package name */
        public int f8988clubfoot = 0;

        /* JADX INFO: renamed from: dent, reason: collision with root package name */
        public int f8998dent = 0;

        /* JADX INFO: renamed from: permissivist, reason: collision with root package name */
        public int f9024permissivist = 0;

        /* JADX INFO: renamed from: cultivated, reason: collision with root package name */
        public int f8995cultivated = 0;

        /* JADX INFO: renamed from: premeiotic, reason: collision with root package name */
        public int f9027premeiotic = 0;

        /* JADX INFO: renamed from: timberyard, reason: collision with root package name */
        public int f9044timberyard = 0;

        /* JADX INFO: renamed from: milliradian, reason: collision with root package name */
        public int f9017milliradian = 0;

        /* JADX INFO: renamed from: treadless, reason: collision with root package name */
        public int f9045treadless = 0;

        /* JADX INFO: renamed from: itchy, reason: collision with root package name */
        public float f9009itchy = 1.0f;

        /* JADX INFO: renamed from: coffeecake, reason: collision with root package name */
        public float f8989coffeecake = 1.0f;

        /* JADX INFO: renamed from: lerp, reason: collision with root package name */
        public int f9012lerp = -1;

        /* JADX INFO: renamed from: nosophobia, reason: collision with root package name */
        public int f9020nosophobia = 0;

        /* JADX INFO: renamed from: lotta, reason: collision with root package name */
        public int f9013lotta = -1;

        /* JADX INFO: renamed from: czestochowa, reason: collision with root package name */
        public boolean f8997czestochowa = false;

        /* JADX INFO: renamed from: sensatory, reason: collision with root package name */
        public boolean f9038sensatory = false;

        /* JADX INFO: renamed from: underbelly, reason: collision with root package name */
        public boolean f9048underbelly = true;

        /* JADX INFO: renamed from: preterite, reason: collision with root package name */
        public int f9029preterite = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f8982wostteth = sparseIntArray;
            sparseIntArray.append(sensatory.wireman.Layout_layout_constraintLeft_toLeftOf, 24);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintLeft_toRightOf, 25);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintRight_toLeftOf, 28);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintRight_toRightOf, 29);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintTop_toTopOf, 35);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintTop_toBottomOf, 34);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintBottom_toTopOf, 4);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintBottom_toBottomOf, 3);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f8982wostteth.append(sensatory.wireman.Layout_layout_editor_absoluteX, 6);
            f8982wostteth.append(sensatory.wireman.Layout_layout_editor_absoluteY, 7);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintGuide_begin, 17);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintGuide_end, 18);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintGuide_percent, 19);
            f8982wostteth.append(sensatory.wireman.Layout_guidelineUseRtl, 90);
            f8982wostteth.append(sensatory.wireman.Layout_android_orientation, 26);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintStart_toEndOf, 31);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintStart_toStartOf, 32);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintEnd_toStartOf, 10);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintEnd_toEndOf, 9);
            f8982wostteth.append(sensatory.wireman.Layout_layout_goneMarginLeft, 13);
            f8982wostteth.append(sensatory.wireman.Layout_layout_goneMarginTop, 16);
            f8982wostteth.append(sensatory.wireman.Layout_layout_goneMarginRight, 14);
            f8982wostteth.append(sensatory.wireman.Layout_layout_goneMarginBottom, 11);
            f8982wostteth.append(sensatory.wireman.Layout_layout_goneMarginStart, 15);
            f8982wostteth.append(sensatory.wireman.Layout_layout_goneMarginEnd, 12);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintVertical_weight, 38);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintHorizontal_weight, 37);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintHorizontal_chainStyle, 39);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintVertical_chainStyle, 40);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintHorizontal_bias, 20);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintVertical_bias, 36);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintDimensionRatio, 5);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintLeft_creator, 91);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintTop_creator, 91);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintRight_creator, 91);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintBottom_creator, 91);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintBaseline_creator, 91);
            f8982wostteth.append(sensatory.wireman.Layout_android_layout_marginLeft, 23);
            f8982wostteth.append(sensatory.wireman.Layout_android_layout_marginRight, 27);
            f8982wostteth.append(sensatory.wireman.Layout_android_layout_marginStart, 30);
            f8982wostteth.append(sensatory.wireman.Layout_android_layout_marginEnd, 8);
            f8982wostteth.append(sensatory.wireman.Layout_android_layout_marginTop, 33);
            f8982wostteth.append(sensatory.wireman.Layout_android_layout_marginBottom, 2);
            f8982wostteth.append(sensatory.wireman.Layout_android_layout_width, 22);
            f8982wostteth.append(sensatory.wireman.Layout_android_layout_height, 21);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintWidth, 41);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintHeight, 42);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constrainedWidth, 87);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constrainedHeight, 88);
            f8982wostteth.append(sensatory.wireman.Layout_layout_wrapBehaviorInParent, 76);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintCircle, 61);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintCircleRadius, 62);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintCircleAngle, 63);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintWidth_percent, 69);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintHeight_percent, 70);
            f8982wostteth.append(sensatory.wireman.Layout_chainUseRtl, 71);
            f8982wostteth.append(sensatory.wireman.Layout_barrierDirection, 72);
            f8982wostteth.append(sensatory.wireman.Layout_barrierMargin, 73);
            f8982wostteth.append(sensatory.wireman.Layout_constraint_referenced_ids, 74);
            f8982wostteth.append(sensatory.wireman.Layout_barrierAllowsGoneWidgets, 75);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintWidth_max, 84);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintWidth_min, 86);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintWidth_max, 83);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintHeight_min, 85);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintWidth, 87);
            f8982wostteth.append(sensatory.wireman.Layout_layout_constraintHeight, 88);
            f8982wostteth.append(sensatory.wireman.ConstraintLayout_Layout_layout_constraintTag, 89);
            f8982wostteth.append(sensatory.wireman.Layout_guidelineUseRtl, 90);
        }

        public void attabal(saneness sanenessVar) {
            this.f8986attabal = sanenessVar.f8986attabal;
            this.f9050wireman = sanenessVar.f9050wireman;
            this.f9033saneness = sanenessVar.f9033saneness;
            this.f9014marial = sanenessVar.f9014marial;
            this.f8987beachfront = sanenessVar.f8987beachfront;
            this.f8991competently = sanenessVar.f8991competently;
            this.f9008impromptu = sanenessVar.f9008impromptu;
            this.f9043taiyuan = sanenessVar.f9043taiyuan;
            this.f8996cutely = sanenessVar.f8996cutely;
            this.f8984apical = sanenessVar.f8984apical;
            this.f9002formularize = sanenessVar.f9002formularize;
            this.f9007impassible = sanenessVar.f9007impassible;
            this.f9046triweekly = sanenessVar.f9046triweekly;
            this.f9011kowloon = sanenessVar.f9011kowloon;
            this.f8985arytenoidectomy = sanenessVar.f8985arytenoidectomy;
            this.f9019monoploid = sanenessVar.f9019monoploid;
            this.f9026polloi = sanenessVar.f9026polloi;
            this.f9018molybdenite = sanenessVar.f9018molybdenite;
            this.f9004graveside = sanenessVar.f9004graveside;
            this.f8983adultoid = sanenessVar.f8983adultoid;
            this.f9000dovishness = sanenessVar.f9000dovishness;
            this.f9003gintrap = sanenessVar.f9003gintrap;
            this.f9032rotuma = sanenessVar.f9032rotuma;
            this.f9028preprohormone = sanenessVar.f9028preprohormone;
            this.f8992cord = sanenessVar.f8992cord;
            this.f8994cuirassed = sanenessVar.f8994cuirassed;
            this.f9041stratoscope = sanenessVar.f9041stratoscope;
            this.f9047trm = sanenessVar.f9047trm;
            this.f9021oilcan = sanenessVar.f9021oilcan;
            this.f9051yemenite = sanenessVar.f9051yemenite;
            this.f9036sealless = sanenessVar.f9036sealless;
            this.f9010kattegat = sanenessVar.f9010kattegat;
            this.f9042supplicat = sanenessVar.f9042supplicat;
            this.f9031restrictive = sanenessVar.f9031restrictive;
            this.f9016merc = sanenessVar.f9016merc;
            this.f9025polder = sanenessVar.f9025polder;
            this.f9037seminary = sanenessVar.f9037seminary;
            this.f9005grimness = sanenessVar.f9005grimness;
            this.f9034saran = sanenessVar.f9034saran;
            this.f9030privatdozent = sanenessVar.f9030privatdozent;
            this.f8993creditor = sanenessVar.f8993creditor;
            this.f9040starveling = sanenessVar.f9040starveling;
            this.f9006hydrovane = sanenessVar.f9006hydrovane;
            this.f9049walach = sanenessVar.f9049walach;
            this.f9023peridotite = sanenessVar.f9023peridotite;
            this.f9015mathsort = sanenessVar.f9015mathsort;
            this.f9039splinterproof = sanenessVar.f9039splinterproof;
            this.f9022overspeculate = sanenessVar.f9022overspeculate;
            this.f8988clubfoot = sanenessVar.f8988clubfoot;
            this.f8998dent = sanenessVar.f8998dent;
            this.f9024permissivist = sanenessVar.f9024permissivist;
            this.f8995cultivated = sanenessVar.f8995cultivated;
            this.f9027premeiotic = sanenessVar.f9027premeiotic;
            this.f9044timberyard = sanenessVar.f9044timberyard;
            this.f9017milliradian = sanenessVar.f9017milliradian;
            this.f9045treadless = sanenessVar.f9045treadless;
            this.f9009itchy = sanenessVar.f9009itchy;
            this.f8989coffeecake = sanenessVar.f8989coffeecake;
            this.f9012lerp = sanenessVar.f9012lerp;
            this.f9020nosophobia = sanenessVar.f9020nosophobia;
            this.f9013lotta = sanenessVar.f9013lotta;
            this.f8990coi = sanenessVar.f8990coi;
            int[] iArr = sanenessVar.f9035sayid;
            if (iArr == null || sanenessVar.f9001empress != null) {
                this.f9035sayid = null;
            } else {
                this.f9035sayid = Arrays.copyOf(iArr, iArr.length);
            }
            this.f9001empress = sanenessVar.f9001empress;
            this.f8997czestochowa = sanenessVar.f8997czestochowa;
            this.f9038sensatory = sanenessVar.f9038sensatory;
            this.f9048underbelly = sanenessVar.f9048underbelly;
            this.f9029preterite = sanenessVar.f9029preterite;
        }

        public void saneness(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sensatory.wireman.Layout);
            this.f9033saneness = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = f8982wostteth.get(index);
                switch (i2) {
                    case 1:
                        this.f9026polloi = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f9026polloi);
                        break;
                    case 2:
                        this.f9025polder = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9025polder);
                        break;
                    case 3:
                        this.f9019monoploid = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f9019monoploid);
                        break;
                    case 4:
                        this.f8985arytenoidectomy = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f8985arytenoidectomy);
                        break;
                    case 5:
                        this.f8994cuirassed = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f9051yemenite = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9051yemenite);
                        break;
                    case 7:
                        this.f9036sealless = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9036sealless);
                        break;
                    case 8:
                        this.f9037seminary = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9037seminary);
                        break;
                    case 9:
                        this.f9032rotuma = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f9032rotuma);
                        break;
                    case 10:
                        this.f9003gintrap = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f9003gintrap);
                        break;
                    case 11:
                        this.f9006hydrovane = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9006hydrovane);
                        break;
                    case 12:
                        this.f9049walach = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9049walach);
                        break;
                    case 13:
                        this.f9030privatdozent = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9030privatdozent);
                        break;
                    case 14:
                        this.f9040starveling = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9040starveling);
                        break;
                    case 15:
                        this.f9023peridotite = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9023peridotite);
                        break;
                    case 16:
                        this.f8993creditor = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8993creditor);
                        break;
                    case 17:
                        this.f8987beachfront = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8987beachfront);
                        break;
                    case 18:
                        this.f8991competently = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8991competently);
                        break;
                    case 19:
                        this.f9008impromptu = typedArrayObtainStyledAttributes.getFloat(index, this.f9008impromptu);
                        break;
                    case 20:
                        this.f9028preprohormone = typedArrayObtainStyledAttributes.getFloat(index, this.f9028preprohormone);
                        break;
                    case 21:
                        this.f9014marial = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f9014marial);
                        break;
                    case 22:
                        this.f9050wireman = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f9050wireman);
                        break;
                    case 23:
                        this.f9042supplicat = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9042supplicat);
                        break;
                    case 24:
                        this.f8996cutely = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f8996cutely);
                        break;
                    case 25:
                        this.f8984apical = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f8984apical);
                        break;
                    case 26:
                        this.f9010kattegat = typedArrayObtainStyledAttributes.getInt(index, this.f9010kattegat);
                        break;
                    case 27:
                        this.f9031restrictive = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9031restrictive);
                        break;
                    case 28:
                        this.f9002formularize = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f9002formularize);
                        break;
                    case 29:
                        this.f9007impassible = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f9007impassible);
                        break;
                    case 30:
                        this.f9005grimness = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9005grimness);
                        break;
                    case 31:
                        this.f8983adultoid = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f8983adultoid);
                        break;
                    case 32:
                        this.f9000dovishness = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f9000dovishness);
                        break;
                    case 33:
                        this.f9016merc = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9016merc);
                        break;
                    case 34:
                        this.f9011kowloon = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f9011kowloon);
                        break;
                    case 35:
                        this.f9046triweekly = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f9046triweekly);
                        break;
                    case 36:
                        this.f8992cord = typedArrayObtainStyledAttributes.getFloat(index, this.f8992cord);
                        break;
                    case 37:
                        this.f9022overspeculate = typedArrayObtainStyledAttributes.getFloat(index, this.f9022overspeculate);
                        break;
                    case 38:
                        this.f9039splinterproof = typedArrayObtainStyledAttributes.getFloat(index, this.f9039splinterproof);
                        break;
                    case 39:
                        this.f8988clubfoot = typedArrayObtainStyledAttributes.getInt(index, this.f8988clubfoot);
                        break;
                    case 40:
                        this.f8998dent = typedArrayObtainStyledAttributes.getInt(index, this.f8998dent);
                        break;
                    case 41:
                        attabal.sealless(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        attabal.sealless(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.f9041stratoscope = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f9041stratoscope);
                                break;
                            case 62:
                                this.f9047trm = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9047trm);
                                break;
                            case 63:
                                this.f9021oilcan = typedArrayObtainStyledAttributes.getFloat(index, this.f9021oilcan);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f9009itchy = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f8989coffeecake = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.f9012lerp = typedArrayObtainStyledAttributes.getInt(index, this.f9012lerp);
                                        break;
                                    case 73:
                                        this.f9020nosophobia = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9020nosophobia);
                                        break;
                                    case 74:
                                        this.f9001empress = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f9048underbelly = typedArrayObtainStyledAttributes.getBoolean(index, this.f9048underbelly);
                                        break;
                                    case 76:
                                        this.f9029preterite = typedArrayObtainStyledAttributes.getInt(index, this.f9029preterite);
                                        break;
                                    case 77:
                                        this.f9018molybdenite = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f9018molybdenite);
                                        break;
                                    case 78:
                                        this.f9004graveside = attabal.yemenite(typedArrayObtainStyledAttributes, index, this.f9004graveside);
                                        break;
                                    case 79:
                                        this.f9015mathsort = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9015mathsort);
                                        break;
                                    case 80:
                                        this.f9034saran = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9034saran);
                                        break;
                                    case 81:
                                        this.f9024permissivist = typedArrayObtainStyledAttributes.getInt(index, this.f9024permissivist);
                                        break;
                                    case 82:
                                        this.f8995cultivated = typedArrayObtainStyledAttributes.getInt(index, this.f8995cultivated);
                                        break;
                                    case 83:
                                        this.f9044timberyard = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9044timberyard);
                                        break;
                                    case 84:
                                        this.f9027premeiotic = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9027premeiotic);
                                        break;
                                    case 85:
                                        this.f9045treadless = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9045treadless);
                                        break;
                                    case 86:
                                        this.f9017milliradian = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9017milliradian);
                                        break;
                                    case 87:
                                        this.f8997czestochowa = typedArrayObtainStyledAttributes.getBoolean(index, this.f8997czestochowa);
                                        break;
                                    case 88:
                                        this.f9038sensatory = typedArrayObtainStyledAttributes.getBoolean(index, this.f9038sensatory);
                                        break;
                                    case 89:
                                        this.f8990coi = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f9043taiyuan = typedArrayObtainStyledAttributes.getBoolean(index, this.f9043taiyuan);
                                        break;
                                    case 91:
                                        Integer.toHexString(index);
                                        f8982wostteth.get(index);
                                        break;
                                    default:
                                        Integer.toHexString(index);
                                        f8982wostteth.get(index);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: ConstraintSet.java */
    public static class wireman {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public boolean f9052attabal = false;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f9055saneness = 0;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public int f9053dern = 0;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public float f9056wireman = 1.0f;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public float f9054marial = Float.NaN;

        public void attabal(wireman wiremanVar) {
            this.f9052attabal = wiremanVar.f9052attabal;
            this.f9055saneness = wiremanVar.f9055saneness;
            this.f9056wireman = wiremanVar.f9056wireman;
            this.f9054marial = wiremanVar.f9054marial;
            this.f9053dern = wiremanVar.f9053dern;
        }

        public void saneness(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sensatory.wireman.PropertySet);
            this.f9052attabal = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == sensatory.wireman.PropertySet_android_alpha) {
                    this.f9056wireman = typedArrayObtainStyledAttributes.getFloat(index, this.f9056wireman);
                } else if (index == sensatory.wireman.PropertySet_android_visibility) {
                    this.f9055saneness = typedArrayObtainStyledAttributes.getInt(index, this.f9055saneness);
                    this.f9055saneness = attabal.f8923taiyuan[this.f9055saneness];
                } else if (index == sensatory.wireman.PropertySet_visibilityMode) {
                    this.f9053dern = typedArrayObtainStyledAttributes.getInt(index, this.f9053dern);
                } else if (index == sensatory.wireman.PropertySet_motionProgress) {
                    this.f9054marial = typedArrayObtainStyledAttributes.getFloat(index, this.f9054marial);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintLeft_toLeftOf, 25);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintLeft_toRightOf, 26);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintRight_toLeftOf, 29);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintRight_toRightOf, 30);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintTop_toTopOf, 36);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintTop_toBottomOf, 35);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintBottom_toTopOf, 4);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintBottom_toBottomOf, 3);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintBaseline_toTopOf, 91);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f8922cutely.append(sensatory.wireman.Constraint_layout_editor_absoluteX, 6);
        f8922cutely.append(sensatory.wireman.Constraint_layout_editor_absoluteY, 7);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintGuide_begin, 17);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintGuide_end, 18);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintGuide_percent, 19);
        f8922cutely.append(sensatory.wireman.Constraint_guidelineUseRtl, 99);
        f8922cutely.append(sensatory.wireman.Constraint_android_orientation, 27);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintStart_toEndOf, 32);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintStart_toStartOf, 33);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintEnd_toStartOf, 10);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintEnd_toEndOf, 9);
        f8922cutely.append(sensatory.wireman.Constraint_layout_goneMarginLeft, 13);
        f8922cutely.append(sensatory.wireman.Constraint_layout_goneMarginTop, 16);
        f8922cutely.append(sensatory.wireman.Constraint_layout_goneMarginRight, 14);
        f8922cutely.append(sensatory.wireman.Constraint_layout_goneMarginBottom, 11);
        f8922cutely.append(sensatory.wireman.Constraint_layout_goneMarginStart, 15);
        f8922cutely.append(sensatory.wireman.Constraint_layout_goneMarginEnd, 12);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintVertical_weight, 40);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintHorizontal_weight, 39);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintVertical_chainStyle, 42);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintHorizontal_bias, 20);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintVertical_bias, 37);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintDimensionRatio, 5);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintLeft_creator, 87);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintTop_creator, 87);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintRight_creator, 87);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintBottom_creator, 87);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintBaseline_creator, 87);
        f8922cutely.append(sensatory.wireman.Constraint_android_layout_marginLeft, 24);
        f8922cutely.append(sensatory.wireman.Constraint_android_layout_marginRight, 28);
        f8922cutely.append(sensatory.wireman.Constraint_android_layout_marginStart, 31);
        f8922cutely.append(sensatory.wireman.Constraint_android_layout_marginEnd, 8);
        f8922cutely.append(sensatory.wireman.Constraint_android_layout_marginTop, 34);
        f8922cutely.append(sensatory.wireman.Constraint_android_layout_marginBottom, 2);
        f8922cutely.append(sensatory.wireman.Constraint_android_layout_width, 23);
        f8922cutely.append(sensatory.wireman.Constraint_android_layout_height, 21);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintWidth, 95);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintHeight, 96);
        f8922cutely.append(sensatory.wireman.Constraint_android_visibility, 22);
        f8922cutely.append(sensatory.wireman.Constraint_android_alpha, 43);
        f8922cutely.append(sensatory.wireman.Constraint_android_elevation, 44);
        f8922cutely.append(sensatory.wireman.Constraint_android_rotationX, 45);
        f8922cutely.append(sensatory.wireman.Constraint_android_rotationY, 46);
        f8922cutely.append(sensatory.wireman.Constraint_android_rotation, 60);
        f8922cutely.append(sensatory.wireman.Constraint_android_scaleX, 47);
        f8922cutely.append(sensatory.wireman.Constraint_android_scaleY, 48);
        f8922cutely.append(sensatory.wireman.Constraint_android_transformPivotX, 49);
        f8922cutely.append(sensatory.wireman.Constraint_android_transformPivotY, 50);
        f8922cutely.append(sensatory.wireman.Constraint_android_translationX, 51);
        f8922cutely.append(sensatory.wireman.Constraint_android_translationY, 52);
        f8922cutely.append(sensatory.wireman.Constraint_android_translationZ, 53);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintWidth_default, 54);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintHeight_default, 55);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintWidth_max, 56);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintHeight_max, 57);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintWidth_min, 58);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintHeight_min, 59);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintCircle, 61);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintCircleRadius, 62);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintCircleAngle, 63);
        f8922cutely.append(sensatory.wireman.Constraint_animateRelativeTo, 64);
        f8922cutely.append(sensatory.wireman.Constraint_transitionEasing, 65);
        f8922cutely.append(sensatory.wireman.Constraint_drawPath, 66);
        f8922cutely.append(sensatory.wireman.Constraint_transitionPathRotate, 67);
        f8922cutely.append(sensatory.wireman.Constraint_motionStagger, 79);
        f8922cutely.append(sensatory.wireman.Constraint_android_id, 38);
        f8922cutely.append(sensatory.wireman.Constraint_motionProgress, 68);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintWidth_percent, 69);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintHeight_percent, 70);
        f8922cutely.append(sensatory.wireman.Constraint_layout_wrapBehaviorInParent, 97);
        f8922cutely.append(sensatory.wireman.Constraint_chainUseRtl, 71);
        f8922cutely.append(sensatory.wireman.Constraint_barrierDirection, 72);
        f8922cutely.append(sensatory.wireman.Constraint_barrierMargin, 73);
        f8922cutely.append(sensatory.wireman.Constraint_constraint_referenced_ids, 74);
        f8922cutely.append(sensatory.wireman.Constraint_barrierAllowsGoneWidgets, 75);
        f8922cutely.append(sensatory.wireman.Constraint_pathMotionArc, 76);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constraintTag, 77);
        f8922cutely.append(sensatory.wireman.Constraint_visibilityMode, 78);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constrainedWidth, 80);
        f8922cutely.append(sensatory.wireman.Constraint_layout_constrainedHeight, 81);
        f8922cutely.append(sensatory.wireman.Constraint_polarRelativeTo, 82);
        f8922cutely.append(sensatory.wireman.Constraint_transformPivotTarget, 83);
        f8922cutely.append(sensatory.wireman.Constraint_quantizeMotionSteps, 84);
        f8922cutely.append(sensatory.wireman.Constraint_quantizeMotionPhase, 85);
        f8922cutely.append(sensatory.wireman.Constraint_quantizeMotionInterpolator, 86);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_editor_absoluteY, 6);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_editor_absoluteY, 7);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_orientation, 27);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_goneMarginLeft, 13);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_goneMarginTop, 16);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_goneMarginRight, 14);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_goneMarginBottom, 11);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_goneMarginStart, 15);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_goneMarginEnd, 12);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintVertical_weight, 40);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintVertical_bias, 37);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintLeft_creator, 87);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintTop_creator, 87);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintRight_creator, 87);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintBottom_creator, 87);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_layout_marginLeft, 24);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_layout_marginRight, 28);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_layout_marginStart, 31);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_layout_marginEnd, 8);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_layout_marginTop, 34);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_layout_marginBottom, 2);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_layout_width, 23);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_layout_height, 21);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintWidth, 95);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintHeight, 96);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_visibility, 22);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_alpha, 43);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_elevation, 44);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_rotationX, 45);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_rotationY, 46);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_rotation, 60);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_scaleX, 47);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_scaleY, 48);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_transformPivotX, 49);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_transformPivotY, 50);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_translationX, 51);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_translationY, 52);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_translationZ, 53);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintWidth_default, 54);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintHeight_default, 55);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintWidth_max, 56);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintHeight_max, 57);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintWidth_min, 58);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintHeight_min, 59);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintCircleRadius, 62);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintCircleAngle, 63);
        f8921apical.append(sensatory.wireman.ConstraintOverride_animateRelativeTo, 64);
        f8921apical.append(sensatory.wireman.ConstraintOverride_transitionEasing, 65);
        f8921apical.append(sensatory.wireman.ConstraintOverride_drawPath, 66);
        f8921apical.append(sensatory.wireman.ConstraintOverride_transitionPathRotate, 67);
        f8921apical.append(sensatory.wireman.ConstraintOverride_motionStagger, 79);
        f8921apical.append(sensatory.wireman.ConstraintOverride_android_id, 38);
        f8921apical.append(sensatory.wireman.ConstraintOverride_motionTarget, 98);
        f8921apical.append(sensatory.wireman.ConstraintOverride_motionProgress, 68);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintWidth_percent, 69);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintHeight_percent, 70);
        f8921apical.append(sensatory.wireman.ConstraintOverride_chainUseRtl, 71);
        f8921apical.append(sensatory.wireman.ConstraintOverride_barrierDirection, 72);
        f8921apical.append(sensatory.wireman.ConstraintOverride_barrierMargin, 73);
        f8921apical.append(sensatory.wireman.ConstraintOverride_constraint_referenced_ids, 74);
        f8921apical.append(sensatory.wireman.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f8921apical.append(sensatory.wireman.ConstraintOverride_pathMotionArc, 76);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constraintTag, 77);
        f8921apical.append(sensatory.wireman.ConstraintOverride_visibilityMode, 78);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constrainedWidth, 80);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_constrainedHeight, 81);
        f8921apical.append(sensatory.wireman.ConstraintOverride_polarRelativeTo, 82);
        f8921apical.append(sensatory.wireman.ConstraintOverride_transformPivotTarget, 83);
        f8921apical.append(sensatory.wireman.ConstraintOverride_quantizeMotionSteps, 84);
        f8921apical.append(sensatory.wireman.ConstraintOverride_quantizeMotionPhase, 85);
        f8921apical.append(sensatory.wireman.ConstraintOverride_quantizeMotionInterpolator, 86);
        f8921apical.append(sensatory.wireman.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static void creditor(C0056attabal c0056attabal, int i, boolean z) {
        if (i == 44) {
            c0056attabal.f8933beachfront.f8975impassible = z;
            return;
        }
        if (i == 75) {
            c0056attabal.f8937marial.f9048underbelly = z;
        } else if (i == 80) {
            c0056attabal.f8937marial.f8997czestochowa = z;
        } else {
            if (i != 81) {
                return;
            }
            c0056attabal.f8937marial.f9038sensatory = z;
        }
    }

    public static void grimness(C0056attabal c0056attabal, int i, float f) {
        if (i == 19) {
            c0056attabal.f8937marial.f9008impromptu = f;
            return;
        }
        if (i == 20) {
            c0056attabal.f8937marial.f9028preprohormone = f;
            return;
        }
        if (i == 37) {
            c0056attabal.f8937marial.f8992cord = f;
            return;
        }
        if (i == 60) {
            c0056attabal.f8933beachfront.f8978saneness = f;
            return;
        }
        if (i == 63) {
            c0056attabal.f8937marial.f9021oilcan = f;
            return;
        }
        if (i == 79) {
            c0056attabal.f8939wireman.f8956competently = f;
            return;
        }
        if (i == 85) {
            c0056attabal.f8939wireman.f8957cutely = f;
            return;
        }
        if (i == 39) {
            c0056attabal.f8937marial.f9022overspeculate = f;
            return;
        }
        if (i == 40) {
            c0056attabal.f8937marial.f9039splinterproof = f;
            return;
        }
        switch (i) {
            case 43:
                c0056attabal.f8935dern.f9056wireman = f;
                break;
            case 44:
                marial marialVar = c0056attabal.f8933beachfront;
                marialVar.f8980triweekly = f;
                marialVar.f8975impassible = true;
                break;
            case 45:
                c0056attabal.f8933beachfront.f8973dern = f;
                break;
            case 46:
                c0056attabal.f8933beachfront.f8981wireman = f;
                break;
            case 47:
                c0056attabal.f8933beachfront.f8977marial = f;
                break;
            case 48:
                c0056attabal.f8933beachfront.f8970beachfront = f;
                break;
            case 49:
                c0056attabal.f8933beachfront.f8971competently = f;
                break;
            case 50:
                c0056attabal.f8933beachfront.f8976impromptu = f;
                break;
            case 51:
                c0056attabal.f8933beachfront.f8972cutely = f;
                break;
            case 52:
                c0056attabal.f8933beachfront.f8968apical = f;
                break;
            case 53:
                c0056attabal.f8933beachfront.f8974formularize = f;
                break;
            default:
                switch (i) {
                    case 67:
                        c0056attabal.f8939wireman.f8964taiyuan = f;
                        break;
                    case 68:
                        c0056attabal.f8935dern.f9054marial = f;
                        break;
                    case 69:
                        c0056attabal.f8937marial.f9009itchy = f;
                        break;
                    case 70:
                        c0056attabal.f8937marial.f8989coffeecake = f;
                        break;
                }
                break;
        }
    }

    public static C0056attabal impassible(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        C0056attabal c0056attabal = new C0056attabal();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, sensatory.wireman.ConstraintOverride);
        merc(c0056attabal, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return c0056attabal;
    }

    public static void kattegat(Object obj, String str, int i) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                    }
                    supplicat(layoutParams, strTrim2);
                    return;
                }
                if (obj instanceof saneness) {
                    ((saneness) obj).f8994cuirassed = strTrim2;
                    return;
                } else {
                    if (obj instanceof C0056attabal.C0057attabal) {
                        ((C0056attabal.C0057attabal) obj).dern(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                            layoutParams2.f8871seminary = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                            layoutParams2.f8834grimness = f;
                            return;
                        }
                    }
                    if (obj instanceof saneness) {
                        saneness sanenessVar = (saneness) obj;
                        if (i == 0) {
                            sanenessVar.f9050wireman = 0;
                            sanenessVar.f9022overspeculate = f;
                            return;
                        } else {
                            sanenessVar.f9014marial = 0;
                            sanenessVar.f9039splinterproof = f;
                            return;
                        }
                    }
                    if (obj instanceof C0056attabal.C0057attabal) {
                        C0056attabal.C0057attabal c0057attabal = (C0056attabal.C0057attabal) obj;
                        if (i == 0) {
                            c0057attabal.saneness(23, 0);
                            c0057attabal.attabal(39, f);
                            return;
                        } else {
                            c0057attabal.saneness(21, 0);
                            c0057attabal.attabal(40, f);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.f8873splinterproof = fMax;
                            layoutParams3.f8822creditor = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.f8854overspeculate = fMax;
                            layoutParams3.f8874starveling = 2;
                            return;
                        }
                    }
                    if (obj instanceof saneness) {
                        saneness sanenessVar2 = (saneness) obj;
                        if (i == 0) {
                            sanenessVar2.f9050wireman = 0;
                            sanenessVar2.f9009itchy = fMax;
                            sanenessVar2.f9024permissivist = 2;
                            return;
                        } else {
                            sanenessVar2.f9014marial = 0;
                            sanenessVar2.f8989coffeecake = fMax;
                            sanenessVar2.f8995cultivated = 2;
                            return;
                        }
                    }
                    if (obj instanceof C0056attabal.C0057attabal) {
                        C0056attabal.C0057attabal c0057attabal2 = (C0056attabal.C0057attabal) obj;
                        if (i == 0) {
                            c0057attabal2.saneness(23, 0);
                            c0057attabal2.saneness(54, 2);
                        } else {
                            c0057attabal2.saneness(21, 0);
                            c0057attabal2.saneness(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void merc(C0056attabal c0056attabal, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        C0056attabal.C0057attabal c0057attabal = new C0056attabal.C0057attabal();
        c0056attabal.f8936impromptu = c0057attabal;
        c0056attabal.f8939wireman.f8954attabal = false;
        c0056attabal.f8937marial.f9033saneness = false;
        c0056attabal.f8935dern.f9052attabal = false;
        c0056attabal.f8933beachfront.f8969attabal = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f8921apical.get(index)) {
                case 2:
                    c0057attabal.saneness(2, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9025polder));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Integer.toHexString(index);
                    f8922cutely.get(index);
                    break;
                case 5:
                    c0057attabal.dern(5, typedArray.getString(index));
                    break;
                case 6:
                    c0057attabal.saneness(6, typedArray.getDimensionPixelOffset(index, c0056attabal.f8937marial.f9051yemenite));
                    break;
                case 7:
                    c0057attabal.saneness(7, typedArray.getDimensionPixelOffset(index, c0056attabal.f8937marial.f9036sealless));
                    break;
                case 8:
                    c0057attabal.saneness(8, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9037seminary));
                    break;
                case 11:
                    c0057attabal.saneness(11, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9006hydrovane));
                    break;
                case 12:
                    c0057attabal.saneness(12, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9049walach));
                    break;
                case 13:
                    c0057attabal.saneness(13, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9030privatdozent));
                    break;
                case 14:
                    c0057attabal.saneness(14, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9040starveling));
                    break;
                case 15:
                    c0057attabal.saneness(15, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9023peridotite));
                    break;
                case 16:
                    c0057attabal.saneness(16, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f8993creditor));
                    break;
                case 17:
                    c0057attabal.saneness(17, typedArray.getDimensionPixelOffset(index, c0056attabal.f8937marial.f8987beachfront));
                    break;
                case 18:
                    c0057attabal.saneness(18, typedArray.getDimensionPixelOffset(index, c0056attabal.f8937marial.f8991competently));
                    break;
                case 19:
                    c0057attabal.attabal(19, typedArray.getFloat(index, c0056attabal.f8937marial.f9008impromptu));
                    break;
                case 20:
                    c0057attabal.attabal(20, typedArray.getFloat(index, c0056attabal.f8937marial.f9028preprohormone));
                    break;
                case 21:
                    c0057attabal.saneness(21, typedArray.getLayoutDimension(index, c0056attabal.f8937marial.f9014marial));
                    break;
                case 22:
                    c0057attabal.saneness(22, f8923taiyuan[typedArray.getInt(index, c0056attabal.f8935dern.f9055saneness)]);
                    break;
                case 23:
                    c0057attabal.saneness(23, typedArray.getLayoutDimension(index, c0056attabal.f8937marial.f9050wireman));
                    break;
                case 24:
                    c0057attabal.saneness(24, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9042supplicat));
                    break;
                case 27:
                    c0057attabal.saneness(27, typedArray.getInt(index, c0056attabal.f8937marial.f9010kattegat));
                    break;
                case 28:
                    c0057attabal.saneness(28, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9031restrictive));
                    break;
                case 31:
                    c0057attabal.saneness(31, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9005grimness));
                    break;
                case 34:
                    c0057attabal.saneness(34, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9016merc));
                    break;
                case 37:
                    c0057attabal.attabal(37, typedArray.getFloat(index, c0056attabal.f8937marial.f8992cord));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, c0056attabal.f8932attabal);
                    c0056attabal.f8932attabal = resourceId;
                    c0057attabal.saneness(38, resourceId);
                    break;
                case 39:
                    c0057attabal.attabal(39, typedArray.getFloat(index, c0056attabal.f8937marial.f9022overspeculate));
                    break;
                case 40:
                    c0057attabal.attabal(40, typedArray.getFloat(index, c0056attabal.f8937marial.f9039splinterproof));
                    break;
                case 41:
                    c0057attabal.saneness(41, typedArray.getInt(index, c0056attabal.f8937marial.f8988clubfoot));
                    break;
                case 42:
                    c0057attabal.saneness(42, typedArray.getInt(index, c0056attabal.f8937marial.f8998dent));
                    break;
                case 43:
                    c0057attabal.attabal(43, typedArray.getFloat(index, c0056attabal.f8935dern.f9056wireman));
                    break;
                case 44:
                    c0057attabal.wireman(44, true);
                    c0057attabal.attabal(44, typedArray.getDimension(index, c0056attabal.f8933beachfront.f8980triweekly));
                    break;
                case 45:
                    c0057attabal.attabal(45, typedArray.getFloat(index, c0056attabal.f8933beachfront.f8973dern));
                    break;
                case 46:
                    c0057attabal.attabal(46, typedArray.getFloat(index, c0056attabal.f8933beachfront.f8981wireman));
                    break;
                case 47:
                    c0057attabal.attabal(47, typedArray.getFloat(index, c0056attabal.f8933beachfront.f8977marial));
                    break;
                case 48:
                    c0057attabal.attabal(48, typedArray.getFloat(index, c0056attabal.f8933beachfront.f8970beachfront));
                    break;
                case 49:
                    c0057attabal.attabal(49, typedArray.getDimension(index, c0056attabal.f8933beachfront.f8971competently));
                    break;
                case 50:
                    c0057attabal.attabal(50, typedArray.getDimension(index, c0056attabal.f8933beachfront.f8976impromptu));
                    break;
                case 51:
                    c0057attabal.attabal(51, typedArray.getDimension(index, c0056attabal.f8933beachfront.f8972cutely));
                    break;
                case 52:
                    c0057attabal.attabal(52, typedArray.getDimension(index, c0056attabal.f8933beachfront.f8968apical));
                    break;
                case 53:
                    c0057attabal.attabal(53, typedArray.getDimension(index, c0056attabal.f8933beachfront.f8974formularize));
                    break;
                case 54:
                    c0057attabal.saneness(54, typedArray.getInt(index, c0056attabal.f8937marial.f9024permissivist));
                    break;
                case 55:
                    c0057attabal.saneness(55, typedArray.getInt(index, c0056attabal.f8937marial.f8995cultivated));
                    break;
                case 56:
                    c0057attabal.saneness(56, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9027premeiotic));
                    break;
                case 57:
                    c0057attabal.saneness(57, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9044timberyard));
                    break;
                case 58:
                    c0057attabal.saneness(58, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9017milliradian));
                    break;
                case 59:
                    c0057attabal.saneness(59, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9045treadless));
                    break;
                case 60:
                    c0057attabal.attabal(60, typedArray.getFloat(index, c0056attabal.f8933beachfront.f8978saneness));
                    break;
                case 62:
                    c0057attabal.saneness(62, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9047trm));
                    break;
                case 63:
                    c0057attabal.attabal(63, typedArray.getFloat(index, c0056attabal.f8937marial.f9021oilcan));
                    break;
                case 64:
                    c0057attabal.saneness(64, yemenite(typedArray, index, c0056attabal.f8939wireman.f8963saneness));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0057attabal.dern(65, typedArray.getString(index));
                    } else {
                        c0057attabal.dern(65, lerp.dern.f32794dern[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0057attabal.saneness(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0057attabal.attabal(67, typedArray.getFloat(index, c0056attabal.f8939wireman.f8964taiyuan));
                    break;
                case 68:
                    c0057attabal.attabal(68, typedArray.getFloat(index, c0056attabal.f8935dern.f9054marial));
                    break;
                case 69:
                    c0057attabal.attabal(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0057attabal.attabal(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    c0057attabal.saneness(72, typedArray.getInt(index, c0056attabal.f8937marial.f9012lerp));
                    break;
                case 73:
                    c0057attabal.saneness(73, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9020nosophobia));
                    break;
                case 74:
                    c0057attabal.dern(74, typedArray.getString(index));
                    break;
                case 75:
                    c0057attabal.wireman(75, typedArray.getBoolean(index, c0056attabal.f8937marial.f9048underbelly));
                    break;
                case 76:
                    c0057attabal.saneness(76, typedArray.getInt(index, c0056attabal.f8939wireman.f8962marial));
                    break;
                case 77:
                    c0057attabal.dern(77, typedArray.getString(index));
                    break;
                case 78:
                    c0057attabal.saneness(78, typedArray.getInt(index, c0056attabal.f8935dern.f9053dern));
                    break;
                case 79:
                    c0057attabal.attabal(79, typedArray.getFloat(index, c0056attabal.f8939wireman.f8956competently));
                    break;
                case 80:
                    c0057attabal.wireman(80, typedArray.getBoolean(index, c0056attabal.f8937marial.f8997czestochowa));
                    break;
                case 81:
                    c0057attabal.wireman(81, typedArray.getBoolean(index, c0056attabal.f8937marial.f9038sensatory));
                    break;
                case 82:
                    c0057attabal.saneness(82, typedArray.getInteger(index, c0056attabal.f8939wireman.f8958dern));
                    break;
                case 83:
                    c0057attabal.saneness(83, yemenite(typedArray, index, c0056attabal.f8933beachfront.f8979taiyuan));
                    break;
                case 84:
                    c0057attabal.saneness(84, typedArray.getInteger(index, c0056attabal.f8939wireman.f8953apical));
                    break;
                case 85:
                    c0057attabal.attabal(85, typedArray.getFloat(index, c0056attabal.f8939wireman.f8957cutely));
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        c0056attabal.f8939wireman.f8965triweekly = typedArray.getResourceId(index, -1);
                        c0057attabal.saneness(89, c0056attabal.f8939wireman.f8965triweekly);
                        dern dernVar = c0056attabal.f8939wireman;
                        if (dernVar.f8965triweekly != -1) {
                            dernVar.f8960impassible = -2;
                            c0057attabal.saneness(88, -2);
                        }
                    } else if (i2 == 3) {
                        c0056attabal.f8939wireman.f8959formularize = typedArray.getString(index);
                        c0057attabal.dern(90, c0056attabal.f8939wireman.f8959formularize);
                        if (c0056attabal.f8939wireman.f8959formularize.indexOf("/") > 0) {
                            c0056attabal.f8939wireman.f8965triweekly = typedArray.getResourceId(index, -1);
                            c0057attabal.saneness(89, c0056attabal.f8939wireman.f8965triweekly);
                            c0056attabal.f8939wireman.f8960impassible = -2;
                            c0057attabal.saneness(88, -2);
                        } else {
                            c0056attabal.f8939wireman.f8960impassible = -1;
                            c0057attabal.saneness(88, -1);
                        }
                    } else {
                        dern dernVar2 = c0056attabal.f8939wireman;
                        dernVar2.f8960impassible = typedArray.getInteger(index, dernVar2.f8965triweekly);
                        c0057attabal.saneness(88, c0056attabal.f8939wireman.f8960impassible);
                    }
                    break;
                case 87:
                    Integer.toHexString(index);
                    f8922cutely.get(index);
                    break;
                case 93:
                    c0057attabal.saneness(93, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9034saran));
                    break;
                case 94:
                    c0057attabal.saneness(94, typedArray.getDimensionPixelSize(index, c0056attabal.f8937marial.f9015mathsort));
                    break;
                case 95:
                    sealless(c0057attabal, typedArray, index, 0);
                    break;
                case 96:
                    sealless(c0057attabal, typedArray, index, 1);
                    break;
                case 97:
                    c0057attabal.saneness(97, typedArray.getInt(index, c0056attabal.f8937marial.f9029preterite));
                    break;
                case 98:
                    if (MotionLayout.f8430incorrectly) {
                        int resourceId2 = typedArray.getResourceId(index, c0056attabal.f8932attabal);
                        c0056attabal.f8932attabal = resourceId2;
                        if (resourceId2 == -1) {
                            c0056attabal.f8938saneness = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c0056attabal.f8938saneness = typedArray.getString(index);
                    } else {
                        c0056attabal.f8932attabal = typedArray.getResourceId(index, c0056attabal.f8932attabal);
                    }
                    break;
                case 99:
                    c0057attabal.wireman(99, typedArray.getBoolean(index, c0056attabal.f8937marial.f9043taiyuan));
                    break;
            }
        }
    }

    public static void privatdozent(C0056attabal c0056attabal, int i, String str) {
        if (i == 5) {
            c0056attabal.f8937marial.f8994cuirassed = str;
            return;
        }
        if (i == 65) {
            c0056attabal.f8939wireman.f8966wireman = str;
            return;
        }
        if (i == 74) {
            saneness sanenessVar = c0056attabal.f8937marial;
            sanenessVar.f9001empress = str;
            sanenessVar.f9035sayid = null;
        } else if (i == 77) {
            c0056attabal.f8937marial.f8990coi = str;
        } else {
            if (i != 90) {
                return;
            }
            c0056attabal.f8939wireman.f8959formularize = str;
        }
    }

    public static void saran(C0056attabal c0056attabal, int i, int i2) {
        if (i == 6) {
            c0056attabal.f8937marial.f9051yemenite = i2;
            return;
        }
        if (i == 7) {
            c0056attabal.f8937marial.f9036sealless = i2;
            return;
        }
        if (i == 8) {
            c0056attabal.f8937marial.f9037seminary = i2;
            return;
        }
        if (i == 27) {
            c0056attabal.f8937marial.f9010kattegat = i2;
            return;
        }
        if (i == 28) {
            c0056attabal.f8937marial.f9031restrictive = i2;
            return;
        }
        if (i == 41) {
            c0056attabal.f8937marial.f8988clubfoot = i2;
            return;
        }
        if (i == 42) {
            c0056attabal.f8937marial.f8998dent = i2;
            return;
        }
        if (i == 61) {
            c0056attabal.f8937marial.f9041stratoscope = i2;
            return;
        }
        if (i == 62) {
            c0056attabal.f8937marial.f9047trm = i2;
            return;
        }
        if (i == 72) {
            c0056attabal.f8937marial.f9012lerp = i2;
            return;
        }
        if (i == 73) {
            c0056attabal.f8937marial.f9020nosophobia = i2;
            return;
        }
        if (i == 88) {
            c0056attabal.f8939wireman.f8960impassible = i2;
            return;
        }
        if (i == 89) {
            c0056attabal.f8939wireman.f8965triweekly = i2;
            return;
        }
        switch (i) {
            case 2:
                c0056attabal.f8937marial.f9025polder = i2;
                break;
            case 11:
                c0056attabal.f8937marial.f9006hydrovane = i2;
                break;
            case 12:
                c0056attabal.f8937marial.f9049walach = i2;
                break;
            case 13:
                c0056attabal.f8937marial.f9030privatdozent = i2;
                break;
            case 14:
                c0056attabal.f8937marial.f9040starveling = i2;
                break;
            case 15:
                c0056attabal.f8937marial.f9023peridotite = i2;
                break;
            case 16:
                c0056attabal.f8937marial.f8993creditor = i2;
                break;
            case 17:
                c0056attabal.f8937marial.f8987beachfront = i2;
                break;
            case 18:
                c0056attabal.f8937marial.f8991competently = i2;
                break;
            case 31:
                c0056attabal.f8937marial.f9005grimness = i2;
                break;
            case 34:
                c0056attabal.f8937marial.f9016merc = i2;
                break;
            case 38:
                c0056attabal.f8932attabal = i2;
                break;
            case 64:
                c0056attabal.f8939wireman.f8963saneness = i2;
                break;
            case 66:
                c0056attabal.f8939wireman.f8955beachfront = i2;
                break;
            case 76:
                c0056attabal.f8939wireman.f8962marial = i2;
                break;
            case 78:
                c0056attabal.f8935dern.f9053dern = i2;
                break;
            case 93:
                c0056attabal.f8937marial.f9034saran = i2;
                break;
            case 94:
                c0056attabal.f8937marial.f9015mathsort = i2;
                break;
            case 97:
                c0056attabal.f8937marial.f9029preterite = i2;
                break;
            default:
                switch (i) {
                    case 21:
                        c0056attabal.f8937marial.f9014marial = i2;
                        break;
                    case 22:
                        c0056attabal.f8935dern.f9055saneness = i2;
                        break;
                    case 23:
                        c0056attabal.f8937marial.f9050wireman = i2;
                        break;
                    case 24:
                        c0056attabal.f8937marial.f9042supplicat = i2;
                        break;
                    default:
                        switch (i) {
                            case 54:
                                c0056attabal.f8937marial.f9024permissivist = i2;
                                break;
                            case 55:
                                c0056attabal.f8937marial.f8995cultivated = i2;
                                break;
                            case 56:
                                c0056attabal.f8937marial.f9027premeiotic = i2;
                                break;
                            case 57:
                                c0056attabal.f8937marial.f9044timberyard = i2;
                                break;
                            case 58:
                                c0056attabal.f8937marial.f9017milliradian = i2;
                                break;
                            case 59:
                                c0056attabal.f8937marial.f9045treadless = i2;
                                break;
                            default:
                                switch (i) {
                                    case 82:
                                        c0056attabal.f8939wireman.f8958dern = i2;
                                        break;
                                    case 83:
                                        c0056attabal.f8933beachfront.f8979taiyuan = i2;
                                        break;
                                    case 84:
                                        c0056attabal.f8939wireman.f8953apical = i2;
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:23:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    /* JADX WARN: Code duplicated, block: B:33:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x0058  */
    /* JADX WARN: Code duplicated, block: B:39:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public static void sealless(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        boolean z;
        C0056attabal.C0057attabal c0057attabal;
        saneness sanenessVar;
        ConstraintLayout.LayoutParams layoutParams;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        if (i3 == 3) {
            kattegat(obj, typedArray.getString(i), i2);
            return;
        }
        int i4 = 0;
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                z = true;
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z = false;
            }
            if (obj instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
                    layoutParams.f8824cultivated = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                    layoutParams.f8861premeiotic = z;
                    return;
                }
            }
            if (obj instanceof saneness) {
                sanenessVar = (saneness) obj;
                if (i2 == 0) {
                    sanenessVar.f9050wireman = i4;
                    sanenessVar.f8997czestochowa = z;
                    return;
                } else {
                    sanenessVar.f9014marial = i4;
                    sanenessVar.f9038sensatory = z;
                    return;
                }
            }
            if (obj instanceof C0056attabal.C0057attabal) {
                c0057attabal = (C0056attabal.C0057attabal) obj;
                if (i2 == 0) {
                    c0057attabal.saneness(23, i4);
                    c0057attabal.wireman(80, z);
                } else {
                    c0057attabal.saneness(21, i4);
                    c0057attabal.wireman(81, z);
                }
            }
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        i4 = dimensionPixelSize;
        z = false;
        if (obj instanceof ConstraintLayout.LayoutParams) {
            layoutParams = (ConstraintLayout.LayoutParams) obj;
            if (i2 == 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = i4;
                layoutParams.f8824cultivated = z;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = i4;
                layoutParams.f8861premeiotic = z;
                return;
            }
        }
        if (obj instanceof saneness) {
            sanenessVar = (saneness) obj;
            if (i2 == 0) {
                sanenessVar.f9050wireman = i4;
                sanenessVar.f8997czestochowa = z;
                return;
            } else {
                sanenessVar.f9014marial = i4;
                sanenessVar.f9038sensatory = z;
                return;
            }
        }
        if (obj instanceof C0056attabal.C0057attabal) {
            c0057attabal = (C0056attabal.C0057attabal) obj;
            if (i2 == 0) {
                c0057attabal.saneness(23, i4);
                c0057attabal.wireman(80, z);
            } else {
                c0057attabal.saneness(21, i4);
                c0057attabal.wireman(81, z);
            }
        }
    }

    public static void supplicat(ConstraintLayout.LayoutParams layoutParams, String str) {
        float fAbs = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i2);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i2, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            fAbs = i == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.f8865restrictive = str;
        layoutParams.f8848merc = fAbs;
        layoutParams.f8859polder = i;
    }

    public static int yemenite(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public final C0056attabal adultoid(int i) {
        if (!this.f8928impromptu.containsKey(Integer.valueOf(i))) {
            this.f8928impromptu.put(Integer.valueOf(i), new C0056attabal());
        }
        return this.f8928impromptu.get(Integer.valueOf(i));
    }

    public void apical(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f8928impromptu.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f8928impromptu.containsKey(Integer.valueOf(id))) {
                czestochowa.attabal.wireman(childAt);
            } else {
                if (this.f8926competently && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && this.f8928impromptu.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0056attabal c0056attabal = this.f8928impromptu.get(Integer.valueOf(id));
                    if (c0056attabal != null) {
                        if (childAt instanceof Barrier) {
                            c0056attabal.f8937marial.f9013lotta = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(c0056attabal.f8937marial.f9012lerp);
                            barrier.setMargin(c0056attabal.f8937marial.f9020nosophobia);
                            barrier.setAllowsGoneWidget(c0056attabal.f8937marial.f9048underbelly);
                            saneness sanenessVar = c0056attabal.f8937marial;
                            int[] iArr = sanenessVar.f9035sayid;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = sanenessVar.f9001empress;
                                if (str != null) {
                                    sanenessVar.f9035sayid = molybdenite(barrier, str);
                                    barrier.setReferencedIds(c0056attabal.f8937marial.f9035sayid);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.dern();
                        c0056attabal.marial(layoutParams);
                        if (z) {
                            ConstraintAttribute.cutely(childAt, c0056attabal.f8934competently);
                        }
                        childAt.setLayoutParams(layoutParams);
                        wireman wiremanVar = c0056attabal.f8935dern;
                        if (wiremanVar.f9053dern == 0) {
                            childAt.setVisibility(wiremanVar.f9055saneness);
                        }
                        childAt.setAlpha(c0056attabal.f8935dern.f9056wireman);
                        childAt.setRotation(c0056attabal.f8933beachfront.f8978saneness);
                        childAt.setRotationX(c0056attabal.f8933beachfront.f8973dern);
                        childAt.setRotationY(c0056attabal.f8933beachfront.f8981wireman);
                        childAt.setScaleX(c0056attabal.f8933beachfront.f8977marial);
                        childAt.setScaleY(c0056attabal.f8933beachfront.f8970beachfront);
                        marial marialVar = c0056attabal.f8933beachfront;
                        if (marialVar.f8979taiyuan != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(c0056attabal.f8933beachfront.f8979taiyuan);
                            if (viewFindViewById != null) {
                                float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left2 = left - childAt.getLeft();
                                    float top2 = top - childAt.getTop();
                                    childAt.setPivotX(left2);
                                    childAt.setPivotY(top2);
                                }
                            }
                        } else {
                            if (!Float.isNaN(marialVar.f8971competently)) {
                                childAt.setPivotX(c0056attabal.f8933beachfront.f8971competently);
                            }
                            if (!Float.isNaN(c0056attabal.f8933beachfront.f8976impromptu)) {
                                childAt.setPivotY(c0056attabal.f8933beachfront.f8976impromptu);
                            }
                        }
                        childAt.setTranslationX(c0056attabal.f8933beachfront.f8972cutely);
                        childAt.setTranslationY(c0056attabal.f8933beachfront.f8968apical);
                        childAt.setTranslationZ(c0056attabal.f8933beachfront.f8974formularize);
                        marial marialVar2 = c0056attabal.f8933beachfront;
                        if (marialVar2.f8975impassible) {
                            childAt.setElevation(marialVar2.f8980triweekly);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            C0056attabal c0056attabal2 = this.f8928impromptu.get(num);
            if (c0056attabal2 != null) {
                if (c0056attabal2.f8937marial.f9013lotta == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    saneness sanenessVar2 = c0056attabal2.f8937marial;
                    int[] iArr2 = sanenessVar2.f9035sayid;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = sanenessVar2.f9001empress;
                        if (str2 != null) {
                            sanenessVar2.f9035sayid = molybdenite(barrier2, str2);
                            barrier2.setReferencedIds(c0056attabal2.f8937marial.f9035sayid);
                        }
                    }
                    barrier2.setType(c0056attabal2.f8937marial.f9012lerp);
                    barrier2.setMargin(c0056attabal2.f8937marial.f9020nosophobia);
                    ConstraintLayout.LayoutParams layoutParamsCompetently = constraintLayout.generateDefaultLayoutParams();
                    barrier2.gintrap();
                    c0056attabal2.marial(layoutParamsCompetently);
                    constraintLayout.addView(barrier2, layoutParamsCompetently);
                }
                if (c0056attabal2.f8937marial.f8986attabal) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsCompetently2 = constraintLayout.generateDefaultLayoutParams();
                    c0056attabal2.marial(layoutParamsCompetently2);
                    constraintLayout.addView(guideline, layoutParamsCompetently2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).cutely(constraintLayout);
            }
        }
    }

    public void arytenoidectomy(attabal attabalVar) {
        this.f8928impromptu.clear();
        for (Integer num : attabalVar.f8928impromptu.keySet()) {
            C0056attabal c0056attabal = attabalVar.f8928impromptu.get(num);
            if (c0056attabal != null) {
                this.f8928impromptu.put(num, c0056attabal.clone());
            }
        }
    }

    public void competently(ConstraintLayout constraintLayout) {
        C0056attabal c0056attabal;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f8928impromptu.containsKey(Integer.valueOf(id))) {
                czestochowa.attabal.wireman(childAt);
            } else {
                if (this.f8926competently && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f8928impromptu.containsKey(Integer.valueOf(id)) && (c0056attabal = this.f8928impromptu.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.cutely(childAt, c0056attabal.f8934competently);
                }
            }
        }
    }

    public int cord(int i) {
        return adultoid(i).f8935dern.f9055saneness;
    }

    public int cuirassed(int i) {
        return adultoid(i).f8935dern.f9053dern;
    }

    public void cutely(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        C0056attabal c0056attabal;
        int id = constraintHelper.getId();
        if (this.f8928impromptu.containsKey(Integer.valueOf(id)) && (c0056attabal = this.f8928impromptu.get(Integer.valueOf(id))) != null && (constraintWidget instanceof sayid.saneness)) {
            constraintHelper.arytenoidectomy(c0056attabal, (sayid.saneness) constraintWidget, layoutParams, sparseArray);
        }
    }

    public C0056attabal dovishness(int i) {
        if (this.f8928impromptu.containsKey(Integer.valueOf(i))) {
            return this.f8928impromptu.get(Integer.valueOf(i));
        }
        return null;
    }

    public void formularize(int i, ConstraintLayout.LayoutParams layoutParams) {
        C0056attabal c0056attabal;
        if (!this.f8928impromptu.containsKey(Integer.valueOf(i)) || (c0056attabal = this.f8928impromptu.get(Integer.valueOf(i))) == null) {
            return;
        }
        c0056attabal.marial(layoutParams);
    }

    public int gintrap(int i) {
        return adultoid(i).f8937marial.f9014marial;
    }

    public final C0056attabal graveside(Context context, AttributeSet attributeSet, boolean z) {
        C0056attabal c0056attabal = new C0056attabal();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? sensatory.wireman.ConstraintOverride : sensatory.wireman.Constraint);
        restrictive(c0056attabal, typedArrayObtainStyledAttributes, z);
        typedArrayObtainStyledAttributes.recycle();
        return c0056attabal;
    }

    public void hydrovane(String str) {
        this.f8931wireman = str.split(",");
        int i = 0;
        while (true) {
            String[] strArr = this.f8931wireman;
            if (i >= strArr.length) {
                return;
            }
            strArr[i] = strArr[i].trim();
            i++;
        }
    }

    public void impromptu(attabal attabalVar) {
        for (C0056attabal c0056attabal : attabalVar.f8928impromptu.values()) {
            if (c0056attabal.f8936impromptu != null) {
                if (c0056attabal.f8938saneness == null) {
                    c0056attabal.f8936impromptu.marial(dovishness(c0056attabal.f8932attabal));
                } else {
                    Iterator<Integer> it = this.f8928impromptu.keySet().iterator();
                    while (it.hasNext()) {
                        C0056attabal c0056attabalDovishness = dovishness(it.next().intValue());
                        String str = c0056attabalDovishness.f8937marial.f8990coi;
                        if (str != null && c0056attabal.f8938saneness.matches(str)) {
                            c0056attabal.f8936impromptu.marial(c0056attabalDovishness);
                            c0056attabalDovishness.f8934competently.putAll((HashMap) c0056attabal.f8934competently.clone());
                        }
                    }
                }
            }
        }
    }

    public void kowloon(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f8928impromptu.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f8926competently && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8928impromptu.containsKey(Integer.valueOf(id))) {
                this.f8928impromptu.put(Integer.valueOf(id), new C0056attabal());
            }
            C0056attabal c0056attabal = this.f8928impromptu.get(Integer.valueOf(id));
            if (c0056attabal != null) {
                c0056attabal.f8934competently = ConstraintAttribute.saneness(this.f8925beachfront, childAt);
                c0056attabal.competently(id, layoutParams);
                c0056attabal.f8935dern.f9055saneness = childAt.getVisibility();
                c0056attabal.f8935dern.f9056wireman = childAt.getAlpha();
                c0056attabal.f8933beachfront.f8978saneness = childAt.getRotation();
                c0056attabal.f8933beachfront.f8973dern = childAt.getRotationX();
                c0056attabal.f8933beachfront.f8981wireman = childAt.getRotationY();
                c0056attabal.f8933beachfront.f8977marial = childAt.getScaleX();
                c0056attabal.f8933beachfront.f8970beachfront = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    marial marialVar = c0056attabal.f8933beachfront;
                    marialVar.f8971competently = pivotX;
                    marialVar.f8976impromptu = pivotY;
                }
                c0056attabal.f8933beachfront.f8972cutely = childAt.getTranslationX();
                c0056attabal.f8933beachfront.f8968apical = childAt.getTranslationY();
                c0056attabal.f8933beachfront.f8974formularize = childAt.getTranslationZ();
                marial marialVar2 = c0056attabal.f8933beachfront;
                if (marialVar2.f8975impassible) {
                    marialVar2.f8980triweekly = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c0056attabal.f8937marial.f9048underbelly = barrier.getAllowsGoneWidget();
                    c0056attabal.f8937marial.f9035sayid = barrier.getReferencedIds();
                    c0056attabal.f8937marial.f9012lerp = barrier.getType();
                    c0056attabal.f8937marial.f9020nosophobia = barrier.getMargin();
                }
            }
        }
    }

    public final int[] molybdenite(View view, String str) {
        int iIntValue;
        Object objTaiyuan;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = sensatory.dern.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objTaiyuan = ((ConstraintLayout) view.getParent()).taiyuan(0, strTrim)) != null && (objTaiyuan instanceof Integer)) {
                iIntValue = ((Integer) objTaiyuan).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public void monoploid(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f8928impromptu.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraints.getChildAt(i);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f8926competently && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8928impromptu.containsKey(Integer.valueOf(id))) {
                this.f8928impromptu.put(Integer.valueOf(id), new C0056attabal());
            }
            C0056attabal c0056attabal = this.f8928impromptu.get(Integer.valueOf(id));
            if (c0056attabal != null) {
                if (childAt instanceof ConstraintHelper) {
                    c0056attabal.taiyuan((ConstraintHelper) childAt, id, layoutParams);
                }
                c0056attabal.impromptu(id, layoutParams);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void oilcan(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            C0056attabal c0056attabalGraveside = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (c0056attabalGraveside == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                c0056attabalGraveside.f8937marial.saneness(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (c0056attabalGraveside == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                c0056attabalGraveside.f8939wireman.saneness(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                c0056attabalGraveside = graveside(context, Xml.asAttributeSet(xmlPullParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (c0056attabalGraveside == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                c0056attabalGraveside.f8935dern.saneness(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (c0056attabalGraveside == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                c0056attabalGraveside.f8933beachfront.saneness(context, Xml.asAttributeSet(xmlPullParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                c0056attabalGraveside = graveside(context, Xml.asAttributeSet(xmlPullParser), false);
                                saneness sanenessVar = c0056attabalGraveside.f8937marial;
                                sanenessVar.f8986attabal = true;
                                sanenessVar.f9033saneness = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                c0056attabalGraveside = graveside(context, Xml.asAttributeSet(xmlPullParser), false);
                                c0056attabalGraveside.f8937marial.f9013lotta = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                c0056attabalGraveside = graveside(context, Xml.asAttributeSet(xmlPullParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (c0056attabalGraveside == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                    }
                    ConstraintAttribute.taiyuan(context, xmlPullParser, c0056attabalGraveside.f8934competently);
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.f8928impromptu.put(Integer.valueOf(c0056attabalGraveside.f8932attabal), c0056attabalGraveside);
                    c0056attabalGraveside = null;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public void polder(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f8926competently && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f8928impromptu.containsKey(Integer.valueOf(id))) {
                this.f8928impromptu.put(Integer.valueOf(id), new C0056attabal());
            }
            C0056attabal c0056attabal = this.f8928impromptu.get(Integer.valueOf(id));
            if (c0056attabal != null) {
                if (!c0056attabal.f8937marial.f9033saneness) {
                    c0056attabal.competently(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        c0056attabal.f8937marial.f9035sayid = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            c0056attabal.f8937marial.f9048underbelly = barrier.getAllowsGoneWidget();
                            c0056attabal.f8937marial.f9012lerp = barrier.getType();
                            c0056attabal.f8937marial.f9020nosophobia = barrier.getMargin();
                        }
                    }
                    c0056attabal.f8937marial.f9033saneness = true;
                }
                wireman wiremanVar = c0056attabal.f8935dern;
                if (!wiremanVar.f9052attabal) {
                    wiremanVar.f9055saneness = childAt.getVisibility();
                    c0056attabal.f8935dern.f9056wireman = childAt.getAlpha();
                    c0056attabal.f8935dern.f9052attabal = true;
                }
                marial marialVar = c0056attabal.f8933beachfront;
                if (!marialVar.f8969attabal) {
                    marialVar.f8969attabal = true;
                    marialVar.f8978saneness = childAt.getRotation();
                    c0056attabal.f8933beachfront.f8973dern = childAt.getRotationX();
                    c0056attabal.f8933beachfront.f8981wireman = childAt.getRotationY();
                    c0056attabal.f8933beachfront.f8977marial = childAt.getScaleX();
                    c0056attabal.f8933beachfront.f8970beachfront = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        marial marialVar2 = c0056attabal.f8933beachfront;
                        marialVar2.f8971competently = pivotX;
                        marialVar2.f8976impromptu = pivotY;
                    }
                    c0056attabal.f8933beachfront.f8972cutely = childAt.getTranslationX();
                    c0056attabal.f8933beachfront.f8968apical = childAt.getTranslationY();
                    c0056attabal.f8933beachfront.f8974formularize = childAt.getTranslationZ();
                    marial marialVar3 = c0056attabal.f8933beachfront;
                    if (marialVar3.f8975impassible) {
                        marialVar3.f8980triweekly = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void polloi(int i, int i2, int i3, float f) {
        saneness sanenessVar = adultoid(i).f8937marial;
        sanenessVar.f9041stratoscope = i2;
        sanenessVar.f9047trm = i3;
        sanenessVar.f9021oilcan = f;
    }

    public C0056attabal preprohormone(int i) {
        return adultoid(i);
    }

    public final void restrictive(C0056attabal c0056attabal, TypedArray typedArray, boolean z) {
        if (z) {
            merc(c0056attabal, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != sensatory.wireman.Constraint_android_id && sensatory.wireman.Constraint_android_layout_marginStart != index && sensatory.wireman.Constraint_android_layout_marginEnd != index) {
                c0056attabal.f8939wireman.f8954attabal = true;
                c0056attabal.f8937marial.f9033saneness = true;
                c0056attabal.f8935dern.f9052attabal = true;
                c0056attabal.f8933beachfront.f8969attabal = true;
            }
            switch (f8922cutely.get(index)) {
                case 1:
                    saneness sanenessVar = c0056attabal.f8937marial;
                    sanenessVar.f9026polloi = yemenite(typedArray, index, sanenessVar.f9026polloi);
                    break;
                case 2:
                    saneness sanenessVar2 = c0056attabal.f8937marial;
                    sanenessVar2.f9025polder = typedArray.getDimensionPixelSize(index, sanenessVar2.f9025polder);
                    break;
                case 3:
                    saneness sanenessVar3 = c0056attabal.f8937marial;
                    sanenessVar3.f9019monoploid = yemenite(typedArray, index, sanenessVar3.f9019monoploid);
                    break;
                case 4:
                    saneness sanenessVar4 = c0056attabal.f8937marial;
                    sanenessVar4.f8985arytenoidectomy = yemenite(typedArray, index, sanenessVar4.f8985arytenoidectomy);
                    break;
                case 5:
                    c0056attabal.f8937marial.f8994cuirassed = typedArray.getString(index);
                    break;
                case 6:
                    saneness sanenessVar5 = c0056attabal.f8937marial;
                    sanenessVar5.f9051yemenite = typedArray.getDimensionPixelOffset(index, sanenessVar5.f9051yemenite);
                    break;
                case 7:
                    saneness sanenessVar6 = c0056attabal.f8937marial;
                    sanenessVar6.f9036sealless = typedArray.getDimensionPixelOffset(index, sanenessVar6.f9036sealless);
                    break;
                case 8:
                    saneness sanenessVar7 = c0056attabal.f8937marial;
                    sanenessVar7.f9037seminary = typedArray.getDimensionPixelSize(index, sanenessVar7.f9037seminary);
                    break;
                case 9:
                    saneness sanenessVar8 = c0056attabal.f8937marial;
                    sanenessVar8.f9032rotuma = yemenite(typedArray, index, sanenessVar8.f9032rotuma);
                    break;
                case 10:
                    saneness sanenessVar9 = c0056attabal.f8937marial;
                    sanenessVar9.f9003gintrap = yemenite(typedArray, index, sanenessVar9.f9003gintrap);
                    break;
                case 11:
                    saneness sanenessVar10 = c0056attabal.f8937marial;
                    sanenessVar10.f9006hydrovane = typedArray.getDimensionPixelSize(index, sanenessVar10.f9006hydrovane);
                    break;
                case 12:
                    saneness sanenessVar11 = c0056attabal.f8937marial;
                    sanenessVar11.f9049walach = typedArray.getDimensionPixelSize(index, sanenessVar11.f9049walach);
                    break;
                case 13:
                    saneness sanenessVar12 = c0056attabal.f8937marial;
                    sanenessVar12.f9030privatdozent = typedArray.getDimensionPixelSize(index, sanenessVar12.f9030privatdozent);
                    break;
                case 14:
                    saneness sanenessVar13 = c0056attabal.f8937marial;
                    sanenessVar13.f9040starveling = typedArray.getDimensionPixelSize(index, sanenessVar13.f9040starveling);
                    break;
                case 15:
                    saneness sanenessVar14 = c0056attabal.f8937marial;
                    sanenessVar14.f9023peridotite = typedArray.getDimensionPixelSize(index, sanenessVar14.f9023peridotite);
                    break;
                case 16:
                    saneness sanenessVar15 = c0056attabal.f8937marial;
                    sanenessVar15.f8993creditor = typedArray.getDimensionPixelSize(index, sanenessVar15.f8993creditor);
                    break;
                case 17:
                    saneness sanenessVar16 = c0056attabal.f8937marial;
                    sanenessVar16.f8987beachfront = typedArray.getDimensionPixelOffset(index, sanenessVar16.f8987beachfront);
                    break;
                case 18:
                    saneness sanenessVar17 = c0056attabal.f8937marial;
                    sanenessVar17.f8991competently = typedArray.getDimensionPixelOffset(index, sanenessVar17.f8991competently);
                    break;
                case 19:
                    saneness sanenessVar18 = c0056attabal.f8937marial;
                    sanenessVar18.f9008impromptu = typedArray.getFloat(index, sanenessVar18.f9008impromptu);
                    break;
                case 20:
                    saneness sanenessVar19 = c0056attabal.f8937marial;
                    sanenessVar19.f9028preprohormone = typedArray.getFloat(index, sanenessVar19.f9028preprohormone);
                    break;
                case 21:
                    saneness sanenessVar20 = c0056attabal.f8937marial;
                    sanenessVar20.f9014marial = typedArray.getLayoutDimension(index, sanenessVar20.f9014marial);
                    break;
                case 22:
                    wireman wiremanVar = c0056attabal.f8935dern;
                    wiremanVar.f9055saneness = typedArray.getInt(index, wiremanVar.f9055saneness);
                    wireman wiremanVar2 = c0056attabal.f8935dern;
                    wiremanVar2.f9055saneness = f8923taiyuan[wiremanVar2.f9055saneness];
                    break;
                case 23:
                    saneness sanenessVar21 = c0056attabal.f8937marial;
                    sanenessVar21.f9050wireman = typedArray.getLayoutDimension(index, sanenessVar21.f9050wireman);
                    break;
                case 24:
                    saneness sanenessVar22 = c0056attabal.f8937marial;
                    sanenessVar22.f9042supplicat = typedArray.getDimensionPixelSize(index, sanenessVar22.f9042supplicat);
                    break;
                case 25:
                    saneness sanenessVar23 = c0056attabal.f8937marial;
                    sanenessVar23.f8996cutely = yemenite(typedArray, index, sanenessVar23.f8996cutely);
                    break;
                case 26:
                    saneness sanenessVar24 = c0056attabal.f8937marial;
                    sanenessVar24.f8984apical = yemenite(typedArray, index, sanenessVar24.f8984apical);
                    break;
                case 27:
                    saneness sanenessVar25 = c0056attabal.f8937marial;
                    sanenessVar25.f9010kattegat = typedArray.getInt(index, sanenessVar25.f9010kattegat);
                    break;
                case 28:
                    saneness sanenessVar26 = c0056attabal.f8937marial;
                    sanenessVar26.f9031restrictive = typedArray.getDimensionPixelSize(index, sanenessVar26.f9031restrictive);
                    break;
                case 29:
                    saneness sanenessVar27 = c0056attabal.f8937marial;
                    sanenessVar27.f9002formularize = yemenite(typedArray, index, sanenessVar27.f9002formularize);
                    break;
                case 30:
                    saneness sanenessVar28 = c0056attabal.f8937marial;
                    sanenessVar28.f9007impassible = yemenite(typedArray, index, sanenessVar28.f9007impassible);
                    break;
                case 31:
                    saneness sanenessVar29 = c0056attabal.f8937marial;
                    sanenessVar29.f9005grimness = typedArray.getDimensionPixelSize(index, sanenessVar29.f9005grimness);
                    break;
                case 32:
                    saneness sanenessVar30 = c0056attabal.f8937marial;
                    sanenessVar30.f8983adultoid = yemenite(typedArray, index, sanenessVar30.f8983adultoid);
                    break;
                case 33:
                    saneness sanenessVar31 = c0056attabal.f8937marial;
                    sanenessVar31.f9000dovishness = yemenite(typedArray, index, sanenessVar31.f9000dovishness);
                    break;
                case 34:
                    saneness sanenessVar32 = c0056attabal.f8937marial;
                    sanenessVar32.f9016merc = typedArray.getDimensionPixelSize(index, sanenessVar32.f9016merc);
                    break;
                case 35:
                    saneness sanenessVar33 = c0056attabal.f8937marial;
                    sanenessVar33.f9011kowloon = yemenite(typedArray, index, sanenessVar33.f9011kowloon);
                    break;
                case 36:
                    saneness sanenessVar34 = c0056attabal.f8937marial;
                    sanenessVar34.f9046triweekly = yemenite(typedArray, index, sanenessVar34.f9046triweekly);
                    break;
                case 37:
                    saneness sanenessVar35 = c0056attabal.f8937marial;
                    sanenessVar35.f8992cord = typedArray.getFloat(index, sanenessVar35.f8992cord);
                    break;
                case 38:
                    c0056attabal.f8932attabal = typedArray.getResourceId(index, c0056attabal.f8932attabal);
                    break;
                case 39:
                    saneness sanenessVar36 = c0056attabal.f8937marial;
                    sanenessVar36.f9022overspeculate = typedArray.getFloat(index, sanenessVar36.f9022overspeculate);
                    break;
                case 40:
                    saneness sanenessVar37 = c0056attabal.f8937marial;
                    sanenessVar37.f9039splinterproof = typedArray.getFloat(index, sanenessVar37.f9039splinterproof);
                    break;
                case 41:
                    saneness sanenessVar38 = c0056attabal.f8937marial;
                    sanenessVar38.f8988clubfoot = typedArray.getInt(index, sanenessVar38.f8988clubfoot);
                    break;
                case 42:
                    saneness sanenessVar39 = c0056attabal.f8937marial;
                    sanenessVar39.f8998dent = typedArray.getInt(index, sanenessVar39.f8998dent);
                    break;
                case 43:
                    wireman wiremanVar3 = c0056attabal.f8935dern;
                    wiremanVar3.f9056wireman = typedArray.getFloat(index, wiremanVar3.f9056wireman);
                    break;
                case 44:
                    marial marialVar = c0056attabal.f8933beachfront;
                    marialVar.f8975impassible = true;
                    marialVar.f8980triweekly = typedArray.getDimension(index, marialVar.f8980triweekly);
                    break;
                case 45:
                    marial marialVar2 = c0056attabal.f8933beachfront;
                    marialVar2.f8973dern = typedArray.getFloat(index, marialVar2.f8973dern);
                    break;
                case 46:
                    marial marialVar3 = c0056attabal.f8933beachfront;
                    marialVar3.f8981wireman = typedArray.getFloat(index, marialVar3.f8981wireman);
                    break;
                case 47:
                    marial marialVar4 = c0056attabal.f8933beachfront;
                    marialVar4.f8977marial = typedArray.getFloat(index, marialVar4.f8977marial);
                    break;
                case 48:
                    marial marialVar5 = c0056attabal.f8933beachfront;
                    marialVar5.f8970beachfront = typedArray.getFloat(index, marialVar5.f8970beachfront);
                    break;
                case 49:
                    marial marialVar6 = c0056attabal.f8933beachfront;
                    marialVar6.f8971competently = typedArray.getDimension(index, marialVar6.f8971competently);
                    break;
                case 50:
                    marial marialVar7 = c0056attabal.f8933beachfront;
                    marialVar7.f8976impromptu = typedArray.getDimension(index, marialVar7.f8976impromptu);
                    break;
                case 51:
                    marial marialVar8 = c0056attabal.f8933beachfront;
                    marialVar8.f8972cutely = typedArray.getDimension(index, marialVar8.f8972cutely);
                    break;
                case 52:
                    marial marialVar9 = c0056attabal.f8933beachfront;
                    marialVar9.f8968apical = typedArray.getDimension(index, marialVar9.f8968apical);
                    break;
                case 53:
                    marial marialVar10 = c0056attabal.f8933beachfront;
                    marialVar10.f8974formularize = typedArray.getDimension(index, marialVar10.f8974formularize);
                    break;
                case 54:
                    saneness sanenessVar40 = c0056attabal.f8937marial;
                    sanenessVar40.f9024permissivist = typedArray.getInt(index, sanenessVar40.f9024permissivist);
                    break;
                case 55:
                    saneness sanenessVar41 = c0056attabal.f8937marial;
                    sanenessVar41.f8995cultivated = typedArray.getInt(index, sanenessVar41.f8995cultivated);
                    break;
                case 56:
                    saneness sanenessVar42 = c0056attabal.f8937marial;
                    sanenessVar42.f9027premeiotic = typedArray.getDimensionPixelSize(index, sanenessVar42.f9027premeiotic);
                    break;
                case 57:
                    saneness sanenessVar43 = c0056attabal.f8937marial;
                    sanenessVar43.f9044timberyard = typedArray.getDimensionPixelSize(index, sanenessVar43.f9044timberyard);
                    break;
                case 58:
                    saneness sanenessVar44 = c0056attabal.f8937marial;
                    sanenessVar44.f9017milliradian = typedArray.getDimensionPixelSize(index, sanenessVar44.f9017milliradian);
                    break;
                case 59:
                    saneness sanenessVar45 = c0056attabal.f8937marial;
                    sanenessVar45.f9045treadless = typedArray.getDimensionPixelSize(index, sanenessVar45.f9045treadless);
                    break;
                case 60:
                    marial marialVar11 = c0056attabal.f8933beachfront;
                    marialVar11.f8978saneness = typedArray.getFloat(index, marialVar11.f8978saneness);
                    break;
                case 61:
                    saneness sanenessVar46 = c0056attabal.f8937marial;
                    sanenessVar46.f9041stratoscope = yemenite(typedArray, index, sanenessVar46.f9041stratoscope);
                    break;
                case 62:
                    saneness sanenessVar47 = c0056attabal.f8937marial;
                    sanenessVar47.f9047trm = typedArray.getDimensionPixelSize(index, sanenessVar47.f9047trm);
                    break;
                case 63:
                    saneness sanenessVar48 = c0056attabal.f8937marial;
                    sanenessVar48.f9021oilcan = typedArray.getFloat(index, sanenessVar48.f9021oilcan);
                    break;
                case 64:
                    dern dernVar = c0056attabal.f8939wireman;
                    dernVar.f8963saneness = yemenite(typedArray, index, dernVar.f8963saneness);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0056attabal.f8939wireman.f8966wireman = typedArray.getString(index);
                    } else {
                        c0056attabal.f8939wireman.f8966wireman = lerp.dern.f32794dern[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    c0056attabal.f8939wireman.f8955beachfront = typedArray.getInt(index, 0);
                    break;
                case 67:
                    dern dernVar2 = c0056attabal.f8939wireman;
                    dernVar2.f8964taiyuan = typedArray.getFloat(index, dernVar2.f8964taiyuan);
                    break;
                case 68:
                    wireman wiremanVar4 = c0056attabal.f8935dern;
                    wiremanVar4.f9054marial = typedArray.getFloat(index, wiremanVar4.f9054marial);
                    break;
                case 69:
                    c0056attabal.f8937marial.f9009itchy = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    c0056attabal.f8937marial.f8989coffeecake = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    saneness sanenessVar49 = c0056attabal.f8937marial;
                    sanenessVar49.f9012lerp = typedArray.getInt(index, sanenessVar49.f9012lerp);
                    break;
                case 73:
                    saneness sanenessVar50 = c0056attabal.f8937marial;
                    sanenessVar50.f9020nosophobia = typedArray.getDimensionPixelSize(index, sanenessVar50.f9020nosophobia);
                    break;
                case 74:
                    c0056attabal.f8937marial.f9001empress = typedArray.getString(index);
                    break;
                case 75:
                    saneness sanenessVar51 = c0056attabal.f8937marial;
                    sanenessVar51.f9048underbelly = typedArray.getBoolean(index, sanenessVar51.f9048underbelly);
                    break;
                case 76:
                    dern dernVar3 = c0056attabal.f8939wireman;
                    dernVar3.f8962marial = typedArray.getInt(index, dernVar3.f8962marial);
                    break;
                case 77:
                    c0056attabal.f8937marial.f8990coi = typedArray.getString(index);
                    break;
                case 78:
                    wireman wiremanVar5 = c0056attabal.f8935dern;
                    wiremanVar5.f9053dern = typedArray.getInt(index, wiremanVar5.f9053dern);
                    break;
                case 79:
                    dern dernVar4 = c0056attabal.f8939wireman;
                    dernVar4.f8956competently = typedArray.getFloat(index, dernVar4.f8956competently);
                    break;
                case 80:
                    saneness sanenessVar52 = c0056attabal.f8937marial;
                    sanenessVar52.f8997czestochowa = typedArray.getBoolean(index, sanenessVar52.f8997czestochowa);
                    break;
                case 81:
                    saneness sanenessVar53 = c0056attabal.f8937marial;
                    sanenessVar53.f9038sensatory = typedArray.getBoolean(index, sanenessVar53.f9038sensatory);
                    break;
                case 82:
                    dern dernVar5 = c0056attabal.f8939wireman;
                    dernVar5.f8958dern = typedArray.getInteger(index, dernVar5.f8958dern);
                    break;
                case 83:
                    marial marialVar12 = c0056attabal.f8933beachfront;
                    marialVar12.f8979taiyuan = yemenite(typedArray, index, marialVar12.f8979taiyuan);
                    break;
                case 84:
                    dern dernVar6 = c0056attabal.f8939wireman;
                    dernVar6.f8953apical = typedArray.getInteger(index, dernVar6.f8953apical);
                    break;
                case 85:
                    dern dernVar7 = c0056attabal.f8939wireman;
                    dernVar7.f8957cutely = typedArray.getFloat(index, dernVar7.f8957cutely);
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        c0056attabal.f8939wireman.f8965triweekly = typedArray.getResourceId(index, -1);
                        dern dernVar8 = c0056attabal.f8939wireman;
                        if (dernVar8.f8965triweekly != -1) {
                            dernVar8.f8960impassible = -2;
                        }
                    } else if (i2 == 3) {
                        c0056attabal.f8939wireman.f8959formularize = typedArray.getString(index);
                        if (c0056attabal.f8939wireman.f8959formularize.indexOf("/") > 0) {
                            c0056attabal.f8939wireman.f8965triweekly = typedArray.getResourceId(index, -1);
                            c0056attabal.f8939wireman.f8960impassible = -2;
                        } else {
                            c0056attabal.f8939wireman.f8960impassible = -1;
                        }
                    } else {
                        dern dernVar9 = c0056attabal.f8939wireman;
                        dernVar9.f8960impassible = typedArray.getInteger(index, dernVar9.f8965triweekly);
                    }
                    break;
                case 87:
                    Integer.toHexString(index);
                    f8922cutely.get(index);
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Integer.toHexString(index);
                    f8922cutely.get(index);
                    break;
                case 91:
                    saneness sanenessVar54 = c0056attabal.f8937marial;
                    sanenessVar54.f9018molybdenite = yemenite(typedArray, index, sanenessVar54.f9018molybdenite);
                    break;
                case 92:
                    saneness sanenessVar55 = c0056attabal.f8937marial;
                    sanenessVar55.f9004graveside = yemenite(typedArray, index, sanenessVar55.f9004graveside);
                    break;
                case 93:
                    saneness sanenessVar56 = c0056attabal.f8937marial;
                    sanenessVar56.f9034saran = typedArray.getDimensionPixelSize(index, sanenessVar56.f9034saran);
                    break;
                case 94:
                    saneness sanenessVar57 = c0056attabal.f8937marial;
                    sanenessVar57.f9015mathsort = typedArray.getDimensionPixelSize(index, sanenessVar57.f9015mathsort);
                    break;
                case 95:
                    sealless(c0056attabal.f8937marial, typedArray, index, 0);
                    break;
                case 96:
                    sealless(c0056attabal.f8937marial, typedArray, index, 1);
                    break;
                case 97:
                    saneness sanenessVar58 = c0056attabal.f8937marial;
                    sanenessVar58.f9029preterite = typedArray.getInt(index, sanenessVar58.f9029preterite);
                    break;
            }
        }
        saneness sanenessVar59 = c0056attabal.f8937marial;
        if (sanenessVar59.f9001empress != null) {
            sanenessVar59.f9035sayid = null;
        }
    }

    public int[] rotuma() {
        Integer[] numArr = (Integer[]) this.f8928impromptu.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public void seminary(attabal attabalVar) {
        for (Integer num : attabalVar.f8928impromptu.keySet()) {
            num.intValue();
            C0056attabal c0056attabal = attabalVar.f8928impromptu.get(num);
            if (!this.f8928impromptu.containsKey(num)) {
                this.f8928impromptu.put(num, new C0056attabal());
            }
            C0056attabal c0056attabal2 = this.f8928impromptu.get(num);
            if (c0056attabal2 != null) {
                saneness sanenessVar = c0056attabal2.f8937marial;
                if (!sanenessVar.f9033saneness) {
                    sanenessVar.attabal(c0056attabal.f8937marial);
                }
                wireman wiremanVar = c0056attabal2.f8935dern;
                if (!wiremanVar.f9052attabal) {
                    wiremanVar.attabal(c0056attabal.f8935dern);
                }
                marial marialVar = c0056attabal2.f8933beachfront;
                if (!marialVar.f8969attabal) {
                    marialVar.attabal(c0056attabal.f8933beachfront);
                }
                dern dernVar = c0056attabal2.f8939wireman;
                if (!dernVar.f8954attabal) {
                    dernVar.attabal(c0056attabal.f8939wireman);
                }
                for (String str : c0056attabal.f8934competently.keySet()) {
                    if (!c0056attabal2.f8934competently.containsKey(str)) {
                        c0056attabal2.f8934competently.put(str, c0056attabal.f8934competently.get(str));
                    }
                }
            }
        }
    }

    public void starveling(boolean z) {
        this.f8926competently = z;
    }

    public int stratoscope(int i) {
        return adultoid(i).f8937marial.f9050wireman;
    }

    public void taiyuan(ConstraintLayout constraintLayout) {
        apical(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void triweekly(Context context, int i) {
        kowloon((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void trm(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C0056attabal c0056attabalGraveside = graveside(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c0056attabalGraveside.f8937marial.f8986attabal = true;
                    }
                    this.f8928impromptu.put(Integer.valueOf(c0056attabalGraveside.f8932attabal), c0056attabalGraveside);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public void walach(boolean z) {
        this.f8924attabal = z;
    }
}
