package czestochowa;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: compiled from: KeyTrigger.java */
/* JADX INFO: loaded from: classes.dex */
public class apical extends wireman {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public View f24838adultoid;

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public RectF f24839apical;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f24840arytenoidectomy;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public float f24841competently = 0.1f;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public float f24842cord;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public boolean f24843cuirassed;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f24844cutely;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public boolean f24845dovishness;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public RectF f24846formularize;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f24847gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f24848graveside;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public HashMap<String, Method> f24849impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f24850impromptu;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public String f24851kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public int f24852molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public String f24853monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public String f24854polloi;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public float f24855preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public boolean f24856rotuma;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f24857taiyuan;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f24858triweekly;

    /* JADX INFO: compiled from: KeyTrigger.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static SparseIntArray f24859attabal;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f24859attabal = sparseIntArray;
            sparseIntArray.append(sensatory.wireman.KeyTrigger_framePosition, 8);
            f24859attabal.append(sensatory.wireman.KeyTrigger_onCross, 4);
            f24859attabal.append(sensatory.wireman.KeyTrigger_onNegativeCross, 1);
            f24859attabal.append(sensatory.wireman.KeyTrigger_onPositiveCross, 2);
            f24859attabal.append(sensatory.wireman.KeyTrigger_motionTarget, 7);
            f24859attabal.append(sensatory.wireman.KeyTrigger_triggerId, 6);
            f24859attabal.append(sensatory.wireman.KeyTrigger_triggerSlack, 5);
            f24859attabal.append(sensatory.wireman.KeyTrigger_motion_triggerOnCollision, 9);
            f24859attabal.append(sensatory.wireman.KeyTrigger_motion_postLayoutCollision, 10);
            f24859attabal.append(sensatory.wireman.KeyTrigger_triggerReceiver, 11);
            f24859attabal.append(sensatory.wireman.KeyTrigger_viewTransitionOnCross, 12);
            f24859attabal.append(sensatory.wireman.KeyTrigger_viewTransitionOnNegativeCross, 13);
            f24859attabal.append(sensatory.wireman.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        public static void attabal(apical apicalVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f24859attabal.get(index)) {
                    case 1:
                        apicalVar.f24853monoploid = typedArray.getString(index);
                        break;
                    case 2:
                        apicalVar.f24854polloi = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Integer.toHexString(index);
                        f24859attabal.get(index);
                        break;
                    case 4:
                        apicalVar.f24851kowloon = typedArray.getString(index);
                        break;
                    case 5:
                        apicalVar.f24841competently = typedArray.getFloat(index, apicalVar.f24841competently);
                        break;
                    case 6:
                        apicalVar.f24852molybdenite = typedArray.getResourceId(index, apicalVar.f24852molybdenite);
                        break;
                    case 7:
                        if (MotionLayout.f8430incorrectly) {
                            int resourceId = typedArray.getResourceId(index, apicalVar.f25036saneness);
                            apicalVar.f25036saneness = resourceId;
                            if (resourceId == -1) {
                                apicalVar.f25034dern = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            apicalVar.f25034dern = typedArray.getString(index);
                        } else {
                            apicalVar.f25036saneness = typedArray.getResourceId(index, apicalVar.f25036saneness);
                        }
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, apicalVar.f25033attabal);
                        apicalVar.f25033attabal = integer;
                        apicalVar.f24855preprohormone = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        apicalVar.f24848graveside = typedArray.getResourceId(index, apicalVar.f24848graveside);
                        break;
                    case 10:
                        apicalVar.f24843cuirassed = typedArray.getBoolean(index, apicalVar.f24843cuirassed);
                        break;
                    case 11:
                        apicalVar.f24840arytenoidectomy = typedArray.getResourceId(index, apicalVar.f24840arytenoidectomy);
                        break;
                    case 12:
                        apicalVar.f24844cutely = typedArray.getResourceId(index, apicalVar.f24844cutely);
                        break;
                    case 13:
                        apicalVar.f24850impromptu = typedArray.getResourceId(index, apicalVar.f24850impromptu);
                        break;
                    case 14:
                        apicalVar.f24857taiyuan = typedArray.getResourceId(index, apicalVar.f24857taiyuan);
                        break;
                }
            }
        }
    }

    public apical() {
        int i = wireman.f25032beachfront;
        this.f24850impromptu = i;
        this.f24857taiyuan = i;
        this.f24844cutely = i;
        this.f24839apical = new RectF();
        this.f24846formularize = new RectF();
        this.f24849impassible = new HashMap<>();
        this.f24858triweekly = -1;
        this.f24851kowloon = null;
        int i2 = wireman.f25032beachfront;
        this.f24840arytenoidectomy = i2;
        this.f24853monoploid = null;
        this.f24854polloi = null;
        this.f24852molybdenite = i2;
        this.f24848graveside = i2;
        this.f24838adultoid = null;
        this.f24845dovishness = true;
        this.f24847gintrap = true;
        this.f24856rotuma = true;
        this.f24855preprohormone = Float.NaN;
        this.f24843cuirassed = false;
        this.f25037wireman = 5;
        this.f25035marial = new HashMap<>();
    }

    public final void cord(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            cuirassed(str, view);
            return;
        }
        if (this.f24849impassible.containsKey(str)) {
            method = this.f24849impassible.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, null);
                this.f24849impassible.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.f24849impassible.put(str, null);
                view.getClass();
                czestochowa.attabal.wireman(view);
                return;
            }
        }
        try {
            method.invoke(view, null);
        } catch (Exception unused2) {
            view.getClass();
            czestochowa.attabal.wireman(view);
        }
    }

    public final void cuirassed(String str, View view) {
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f25035marial.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.f25035marial.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.attabal(view);
                }
            }
        }
    }

    @Override // czestochowa.wireman
    public wireman dern(wireman wiremanVar) {
        super.dern(wiremanVar);
        apical apicalVar = (apical) wiremanVar;
        this.f24858triweekly = apicalVar.f24858triweekly;
        this.f24851kowloon = apicalVar.f24851kowloon;
        this.f24840arytenoidectomy = apicalVar.f24840arytenoidectomy;
        this.f24853monoploid = apicalVar.f24853monoploid;
        this.f24854polloi = apicalVar.f24854polloi;
        this.f24852molybdenite = apicalVar.f24852molybdenite;
        this.f24848graveside = apicalVar.f24848graveside;
        this.f24838adultoid = apicalVar.f24838adultoid;
        this.f24841competently = apicalVar.f24841competently;
        this.f24845dovishness = apicalVar.f24845dovishness;
        this.f24847gintrap = apicalVar.f24847gintrap;
        this.f24856rotuma = apicalVar.f24856rotuma;
        this.f24855preprohormone = apicalVar.f24855preprohormone;
        this.f24842cord = apicalVar.f24842cord;
        this.f24843cuirassed = apicalVar.f24843cuirassed;
        this.f24839apical = apicalVar.f24839apical;
        this.f24846formularize = apicalVar.f24846formularize;
        this.f24849impassible = apicalVar.f24849impassible;
        return this;
    }

    @Override // czestochowa.wireman
    public void marial(Context context, AttributeSet attributeSet) {
        attabal.attabal(this, context.obtainStyledAttributes(attributeSet, sensatory.wireman.KeyTrigger), context);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00db  */
    public void preprohormone(float f, View view) {
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z4;
        boolean z5 = true;
        boolean z6 = false;
        if (this.f24848graveside != wireman.f25032beachfront) {
            if (this.f24838adultoid == null) {
                this.f24838adultoid = ((ViewGroup) view.getParent()).findViewById(this.f24848graveside);
            }
            stratoscope(this.f24839apical, this.f24838adultoid, this.f24843cuirassed);
            stratoscope(this.f24846formularize, view, this.f24843cuirassed);
            if (this.f24839apical.intersect(this.f24846formularize)) {
                if (this.f24845dovishness) {
                    this.f24845dovishness = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f24856rotuma) {
                    this.f24856rotuma = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f24847gintrap = true;
            } else {
                if (this.f24845dovishness) {
                    z = false;
                } else {
                    this.f24845dovishness = true;
                    z = true;
                }
                if (this.f24847gintrap) {
                    this.f24847gintrap = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f24856rotuma = true;
                z6 = z4;
                z3 = false;
            }
        } else {
            if (this.f24845dovishness) {
                float f6 = this.f24855preprohormone;
                if ((f - f6) * (this.f24842cord - f6) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.f24845dovishness = false;
                    z = true;
                }
                if (this.f24847gintrap) {
                    f4 = this.f24855preprohormone;
                    f5 = f - f4;
                    if ((this.f24842cord - f4) * f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.f24847gintrap = false;
                        z2 = true;
                    }
                    if (this.f24856rotuma) {
                        f2 = this.f24855preprohormone;
                        f3 = f - f2;
                        if ((this.f24842cord - f2) * f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            z5 = false;
                        } else {
                            this.f24856rotuma = false;
                        }
                        z3 = z5;
                    } else {
                        if (Math.abs(f - this.f24855preprohormone) > this.f24841competently) {
                            this.f24856rotuma = true;
                        }
                        z3 = false;
                    }
                    z6 = z2;
                } else if (Math.abs(f - this.f24855preprohormone) > this.f24841competently) {
                    this.f24847gintrap = true;
                }
                z2 = false;
                if (this.f24856rotuma) {
                    f2 = this.f24855preprohormone;
                    f3 = f - f2;
                    if ((this.f24842cord - f2) * f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    z3 = z5;
                } else {
                    if (Math.abs(f - this.f24855preprohormone) > this.f24841competently) {
                        this.f24856rotuma = true;
                    }
                    z3 = false;
                }
                z6 = z2;
            } else if (Math.abs(f - this.f24855preprohormone) > this.f24841competently) {
                this.f24845dovishness = true;
            }
            z = false;
            if (this.f24847gintrap) {
                f4 = this.f24855preprohormone;
                f5 = f - f4;
                if ((this.f24842cord - f4) * f5 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                if (this.f24856rotuma) {
                    f2 = this.f24855preprohormone;
                    f3 = f - f2;
                    if ((this.f24842cord - f2) * f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    z3 = z5;
                } else {
                    if (Math.abs(f - this.f24855preprohormone) > this.f24841competently) {
                        this.f24856rotuma = true;
                    }
                    z3 = false;
                }
                z6 = z2;
            } else if (Math.abs(f - this.f24855preprohormone) > this.f24841competently) {
                this.f24847gintrap = true;
            }
            z2 = false;
            if (this.f24856rotuma) {
                f2 = this.f24855preprohormone;
                f3 = f - f2;
                if ((this.f24842cord - f2) * f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                z3 = z5;
            } else {
                if (Math.abs(f - this.f24855preprohormone) > this.f24841competently) {
                    this.f24856rotuma = true;
                }
                z3 = false;
            }
            z6 = z2;
        }
        this.f24842cord = f;
        if (z6 || z || z3) {
            ((MotionLayout) view.getParent()).coffeecake(this.f24852molybdenite, z3, f);
        }
        View viewFindViewById = this.f24840arytenoidectomy == wireman.f25032beachfront ? view : ((MotionLayout) view.getParent()).findViewById(this.f24840arytenoidectomy);
        if (z6) {
            String str = this.f24853monoploid;
            if (str != null) {
                cord(str, viewFindViewById);
            }
            if (this.f24850impromptu != wireman.f25032beachfront) {
                ((MotionLayout) view.getParent()).technofreak(this.f24850impromptu, viewFindViewById);
            }
        }
        if (z3) {
            String str2 = this.f24854polloi;
            if (str2 != null) {
                cord(str2, viewFindViewById);
            }
            if (this.f24857taiyuan != wireman.f25032beachfront) {
                ((MotionLayout) view.getParent()).technofreak(this.f24857taiyuan, viewFindViewById);
            }
        }
        if (z) {
            String str3 = this.f24851kowloon;
            if (str3 != null) {
                cord(str3, viewFindViewById);
            }
            if (this.f24844cutely != wireman.f25032beachfront) {
                ((MotionLayout) view.getParent()).technofreak(this.f24844cutely, viewFindViewById);
            }
        }
    }

    @Override // czestochowa.wireman
    /* JADX INFO: renamed from: saneness */
    public wireman clone() {
        return new apical().dern(this);
    }

    public final void stratoscope(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // czestochowa.wireman
    public void attabal(HashMap<String, coi.wireman> map) {
    }

    @Override // czestochowa.wireman
    public void wireman(HashSet<String> hashSet) {
    }
}
