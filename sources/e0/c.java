package e0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.storage.androidcleaner.R;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f38988a = new ThreadLocal();

    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        int depth;
        int color;
        float f10;
        int i10;
        int iB;
        TypedValue typedValue;
        resources = resources;
        theme = theme;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r10 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int next2 = xmlResourceParser.next();
            if (next2 == r10 || ((depth = xmlResourceParser.getDepth()) < depth2 && next2 == 3)) {
                break;
            }
            if (next2 == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr2 = a0.a.f3313a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr2) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, i11, i11);
                int resourceId = ObtainAttributes.getResourceId(i11, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f38988a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r10);
                    int i13 = typedValue.type;
                    if (i13 < 28 || i13 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i11, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i11, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i11, -65281);
                }
                if (ObtainAttributes.hasValue(r10)) {
                    f10 = ObtainAttributes.getFloat(r10, 1.0f);
                } else {
                    f10 = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r10;
                float f11 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i14 = i11;
                int i15 = i14;
                while (i14 < attributeCount) {
                    int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i14);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i16 = i15 + 1;
                        if (!attributeSetAsAttributeSet.getAttributeBooleanValue(i14, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i15] = attributeNameResource;
                        i15 = i16;
                    }
                    i14++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i15);
                float f12 = 100.0f;
                boolean z10 = (f11 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f11 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f10 != 1.0f || z10) {
                    int iAlpha = (int) ((Color.alpha(color) * f10) + 0.5f);
                    if (iAlpha < 0) {
                        i10 = 0;
                    } else {
                        i10 = 255;
                        if (iAlpha <= 255) {
                            i10 = iAlpha;
                        }
                    }
                    if (z10) {
                        a aVarA = a.a(color);
                        float f13 = aVarA.f38978a;
                        float f14 = aVarA.f38979b;
                        k kVar = k.f39007k;
                        if (f14 >= 1.0d && Math.round(f11) > 0.0d && Math.round(f11) < 100.0d) {
                            float fMin = f13 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : Math.min(360.0f, f13);
                            float f15 = 0.0f;
                            float f16 = f14;
                            boolean z11 = r16 == true ? 1 : 0;
                            a aVar = null;
                            while (true) {
                                if (Math.abs(f15 - f14) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    depth2 = depth2;
                                    if (aVar != null) {
                                        iB = aVar.c(kVar);
                                        break;
                                    }
                                    iB = b.b(f11);
                                    break;
                                }
                                float f17 = 1000.0f;
                                float f18 = f12;
                                float f19 = 0.0f;
                                float f20 = 1000.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f19 - f18) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                        depth2 = depth2;
                                        f12 = f12;
                                        break;
                                    }
                                    f12 = f12;
                                    float f21 = ((f18 - f19) / 2.0f) + f19;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iC = a.b(f21, f16, fMin).c(k.f39007k);
                                    float fC = b.c(Color.red(iC));
                                    float fC2 = b.c(Color.green(iC));
                                    float fC3 = b.c(Color.blue(iC));
                                    float[] fArr = b.f38987d[r16 == true ? 1 : 0];
                                    float f22 = ((fC3 * fArr[2]) + ((fC2 * fArr[r16 == true ? 1 : 0]) + (fC * fArr[0]))) / f12;
                                    float fCbrt = f22 <= 0.008856452f ? f22 * 903.2963f : (((float) Math.cbrt(f22)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f11 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC);
                                        attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                        a aVarB = a.b(aVarA2.f38980c, aVarA2.f38979b, fMin);
                                        float f23 = aVarA2.f38981d - aVarB.f38981d;
                                        float f24 = aVarA2.f38982e - aVarB.f38982e;
                                        float f25 = aVarA2.f38983f - aVarB.f38983f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f25 * f25) + (f24 * f24) + (f23 * f23)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f20 = fPow;
                                            f17 = fAbs;
                                            aVar2 = aVarA2;
                                        }
                                    } else {
                                        attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                        depth2 = depth2;
                                    }
                                    if (f17 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f20 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        break;
                                    }
                                    if (fCbrt < f11) {
                                        f19 = f21;
                                    } else {
                                        f18 = f21;
                                    }
                                    f12 = f12;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                                    depth2 = depth2;
                                }
                                a aVar3 = aVar2;
                                if (!z11) {
                                    if (aVar3 == null) {
                                        f14 = f16;
                                    } else {
                                        aVar = aVar3;
                                        f15 = f16;
                                    }
                                    f16 = ((f14 - f15) / 2.0f) + f15;
                                } else {
                                    if (aVar3 != null) {
                                        iB = aVar3.c(kVar);
                                        break;
                                    }
                                    f16 = ((f14 - f15) / 2.0f) + f15;
                                    z11 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                            depth2 = depth2;
                            iB = b.b(f11);
                        }
                        color = iB;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (i10 << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                    depth2 = depth2;
                }
                int i17 = i12 + 1;
                if (i17 > iArr.length) {
                    int[] iArr4 = new int[i12 <= 4 ? 8 : i12 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i12);
                    iArr = iArr4;
                }
                iArr[i12] = color;
                if (i17 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i12 > 4 ? i12 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i12);
                    objArr = objArr2;
                }
                objArr[i12] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i12 = i17;
                r10 = r16 == true ? 1 : 0;
                attributeSetAsAttributeSet = attributeSetAsAttributeSet;
                depth2 = depth2;
                i11 = 0;
            } else {
                AttributeSet attributeSet = attributeSetAsAttributeSet;
                int i18 = depth2;
                r10 = r10 == true ? 1 : 0;
                attributeSetAsAttributeSet = attributeSet;
                depth2 = i18;
                i11 = 0;
            }
        }
        int[] iArr5 = new int[i12];
        int[][] iArr6 = new int[i12][];
        System.arraycopy(iArr, 0, iArr5, 0, i12);
        System.arraycopy(objArr, 0, iArr6, 0, i12);
        return new ColorStateList(iArr6, iArr5);
    }
}
