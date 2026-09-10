package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f47788a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f47789b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47790c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47791d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f47792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f47793f;

    public /* synthetic */ s(TextView textView) {
        this.f47793f = textView;
    }

    public static HashMap d(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f47793f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f47790c || this.f47791d) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f47790c) {
                    drawableMutate.setTintList((ColorStateList) this.f47788a);
                }
                if (this.f47791d) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f47789b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        r rVar = (r) this.f47793f;
        Drawable checkMarkDrawable = rVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f47790c || this.f47791d) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f47790c) {
                    drawableMutate.setTintList((ColorStateList) this.f47788a);
                }
                if (this.f47791d) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f47789b);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(rVar.getDrawableState());
                }
                rVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(AttributeSet attributeSet, int i10) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f47793f;
        Context context = compoundButton.getContext();
        int[] iArr = j.a.f43528m;
        g9.k kVarZ = g9.k.z(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) kVarZ.f41771c;
        Context context2 = compoundButton.getContext();
        TypedArray typedArray2 = (TypedArray) kVarZ.f41771c;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        m0.p0.b(compoundButton, context2, iArr, attributeSet, typedArray2, i10, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(com.google.android.gms.internal.auth.o.i(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(com.google.android.gms.internal.auth.o.i(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(com.google.android.gms.internal.auth.o.i(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(kVarZ.q(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(h1.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            kVarZ.B();
        }
    }
}
