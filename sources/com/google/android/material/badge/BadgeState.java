package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.datastore.preferences.protobuf.a;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class BadgeState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final State f19107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final State f19108b = new State();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19109c;
    public final float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f19110e;
    public final float f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f19111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19112i;
    public final int j;
    public final int k;

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new AnonymousClass1();
        public Integer A0;
        public Integer B0;
        public Integer C0;
        public Integer D0;
        public Boolean E0;
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Integer f19113Y;
        public Integer Z;
        public Integer e0;
        public Integer f0;
        public Integer g0;
        public Integer h0;
        public Integer i0;
        public String k0;
        public Locale o0;
        public String p0;
        public CharSequence q0;
        public int r0;
        public int s0;
        public Integer t0;
        public Integer v0;
        public Integer w0;
        public Integer x0;
        public Integer y0;
        public Integer z0;
        public int j0 = 255;
        public int l0 = -2;
        public int m0 = -2;
        public int n0 = -2;
        public Boolean u0 = Boolean.TRUE;

        /* JADX INFO: renamed from: com.google.android.material.badge.BadgeState$State$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                State state = new State();
                state.j0 = 255;
                state.l0 = -2;
                state.m0 = -2;
                state.n0 = -2;
                state.u0 = Boolean.TRUE;
                state.X = parcel.readInt();
                state.f19113Y = (Integer) parcel.readSerializable();
                state.Z = (Integer) parcel.readSerializable();
                state.e0 = (Integer) parcel.readSerializable();
                state.f0 = (Integer) parcel.readSerializable();
                state.g0 = (Integer) parcel.readSerializable();
                state.h0 = (Integer) parcel.readSerializable();
                state.i0 = (Integer) parcel.readSerializable();
                state.j0 = parcel.readInt();
                state.k0 = parcel.readString();
                state.l0 = parcel.readInt();
                state.m0 = parcel.readInt();
                state.n0 = parcel.readInt();
                state.p0 = parcel.readString();
                state.q0 = parcel.readString();
                state.r0 = parcel.readInt();
                state.t0 = (Integer) parcel.readSerializable();
                state.v0 = (Integer) parcel.readSerializable();
                state.w0 = (Integer) parcel.readSerializable();
                state.x0 = (Integer) parcel.readSerializable();
                state.y0 = (Integer) parcel.readSerializable();
                state.z0 = (Integer) parcel.readSerializable();
                state.A0 = (Integer) parcel.readSerializable();
                state.D0 = (Integer) parcel.readSerializable();
                state.B0 = (Integer) parcel.readSerializable();
                state.C0 = (Integer) parcel.readSerializable();
                state.u0 = (Boolean) parcel.readSerializable();
                state.o0 = (Locale) parcel.readSerializable();
                state.E0 = (Boolean) parcel.readSerializable();
                return state;
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.X);
            parcel.writeSerializable(this.f19113Y);
            parcel.writeSerializable(this.Z);
            parcel.writeSerializable(this.e0);
            parcel.writeSerializable(this.f0);
            parcel.writeSerializable(this.g0);
            parcel.writeSerializable(this.h0);
            parcel.writeSerializable(this.i0);
            parcel.writeInt(this.j0);
            parcel.writeString(this.k0);
            parcel.writeInt(this.l0);
            parcel.writeInt(this.m0);
            parcel.writeInt(this.n0);
            String str = this.p0;
            parcel.writeString(str != null ? str.toString() : null);
            CharSequence charSequence = this.q0;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            parcel.writeInt(this.r0);
            parcel.writeSerializable(this.t0);
            parcel.writeSerializable(this.v0);
            parcel.writeSerializable(this.w0);
            parcel.writeSerializable(this.x0);
            parcel.writeSerializable(this.y0);
            parcel.writeSerializable(this.z0);
            parcel.writeSerializable(this.A0);
            parcel.writeSerializable(this.D0);
            parcel.writeSerializable(this.B0);
            parcel.writeSerializable(this.C0);
            parcel.writeSerializable(this.u0);
            parcel.writeSerializable(this.o0);
            parcel.writeSerializable(this.E0);
        }
    }

    public BadgeState(Context context, State state) {
        AttributeSet attributeSetAsAttributeSet;
        int styleAttribute;
        int next;
        state = state == null ? new State() : state;
        int i2 = state.X;
        if (i2 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i2);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e2) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(a.h(i2, new StringBuilder("Can't load badge resource ID #0x")));
                notFoundException.initCause(e2);
                throw notFoundException;
            }
        } else {
            attributeSetAsAttributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayD = ThemeEnforcement.d(context, attributeSetAsAttributeSet, R.styleable.f19067b, com.charging.screenshow.battery.animations.themes.R.attr.badgeStyle, styleAttribute == 0 ? com.charging.screenshow.battery.animations.themes.R.style.Widget_MaterialComponents_Badge : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.f19109c = typedArrayD.getDimensionPixelSize(4, -1);
        this.f19112i = context.getResources().getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayD.getDimensionPixelSize(14, -1);
        this.f19110e = typedArrayD.getDimension(12, resources.getDimension(com.charging.screenshow.battery.animations.themes.R.dimen.m3_badge_size));
        this.g = typedArrayD.getDimension(17, resources.getDimension(com.charging.screenshow.battery.animations.themes.R.dimen.m3_badge_with_text_size));
        this.f = typedArrayD.getDimension(3, resources.getDimension(com.charging.screenshow.battery.animations.themes.R.dimen.m3_badge_size));
        this.f19111h = typedArrayD.getDimension(13, resources.getDimension(com.charging.screenshow.battery.animations.themes.R.dimen.m3_badge_with_text_size));
        this.k = typedArrayD.getInt(24, 1);
        State state2 = this.f19108b;
        int i3 = state.j0;
        state2.j0 = i3 == -2 ? 255 : i3;
        int i4 = state.l0;
        if (i4 != -2) {
            state2.l0 = i4;
        } else if (typedArrayD.hasValue(23)) {
            this.f19108b.l0 = typedArrayD.getInt(23, 0);
        } else {
            this.f19108b.l0 = -1;
        }
        String str = state.k0;
        if (str != null) {
            this.f19108b.k0 = str;
        } else if (typedArrayD.hasValue(7)) {
            this.f19108b.k0 = typedArrayD.getString(7);
        }
        State state3 = this.f19108b;
        state3.p0 = state.p0;
        CharSequence charSequence = state.q0;
        state3.q0 = charSequence == null ? context.getString(com.charging.screenshow.battery.animations.themes.R.string.mtrl_badge_numberless_content_description) : charSequence;
        State state4 = this.f19108b;
        int i5 = state.r0;
        state4.r0 = i5 == 0 ? com.charging.screenshow.battery.animations.themes.R.plurals.mtrl_badge_content_description : i5;
        int i6 = state.s0;
        state4.s0 = i6 == 0 ? com.charging.screenshow.battery.animations.themes.R.string.mtrl_exceed_max_badge_number_content_description : i6;
        Boolean bool = state.u0;
        state4.u0 = Boolean.valueOf(bool == null || bool.booleanValue());
        State state5 = this.f19108b;
        int i7 = state.m0;
        state5.m0 = i7 == -2 ? typedArrayD.getInt(21, -2) : i7;
        State state6 = this.f19108b;
        int i8 = state.n0;
        state6.n0 = i8 == -2 ? typedArrayD.getInt(22, -2) : i8;
        State state7 = this.f19108b;
        Integer num = state.f0;
        state7.f0 = Integer.valueOf(num == null ? typedArrayD.getResourceId(5, com.charging.screenshow.battery.animations.themes.R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        State state8 = this.f19108b;
        Integer num2 = state.g0;
        state8.g0 = Integer.valueOf(num2 == null ? typedArrayD.getResourceId(6, 0) : num2.intValue());
        State state9 = this.f19108b;
        Integer num3 = state.h0;
        state9.h0 = Integer.valueOf(num3 == null ? typedArrayD.getResourceId(15, com.charging.screenshow.battery.animations.themes.R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        State state10 = this.f19108b;
        Integer num4 = state.i0;
        state10.i0 = Integer.valueOf(num4 == null ? typedArrayD.getResourceId(16, 0) : num4.intValue());
        State state11 = this.f19108b;
        Integer num5 = state.f19113Y;
        state11.f19113Y = Integer.valueOf(num5 == null ? MaterialResources.a(context, typedArrayD, 1).getDefaultColor() : num5.intValue());
        State state12 = this.f19108b;
        Integer num6 = state.e0;
        state12.e0 = Integer.valueOf(num6 == null ? typedArrayD.getResourceId(8, com.charging.screenshow.battery.animations.themes.R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = state.Z;
        if (num7 != null) {
            this.f19108b.Z = num7;
        } else if (typedArrayD.hasValue(9)) {
            this.f19108b.Z = Integer.valueOf(MaterialResources.a(context, typedArrayD, 9).getDefaultColor());
        } else {
            this.f19108b.Z = Integer.valueOf(new TextAppearance(context, this.f19108b.e0.intValue()).j.getDefaultColor());
        }
        State state13 = this.f19108b;
        Integer num8 = state.t0;
        state13.t0 = Integer.valueOf(num8 == null ? typedArrayD.getInt(2, 8388661) : num8.intValue());
        State state14 = this.f19108b;
        Integer num9 = state.v0;
        state14.v0 = Integer.valueOf(num9 == null ? typedArrayD.getDimensionPixelSize(11, resources.getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        State state15 = this.f19108b;
        Integer num10 = state.w0;
        state15.w0 = Integer.valueOf(num10 == null ? typedArrayD.getDimensionPixelSize(10, resources.getDimensionPixelSize(com.charging.screenshow.battery.animations.themes.R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        State state16 = this.f19108b;
        Integer num11 = state.x0;
        state16.x0 = Integer.valueOf(num11 == null ? typedArrayD.getDimensionPixelOffset(18, 0) : num11.intValue());
        State state17 = this.f19108b;
        Integer num12 = state.y0;
        state17.y0 = Integer.valueOf(num12 == null ? typedArrayD.getDimensionPixelOffset(25, 0) : num12.intValue());
        State state18 = this.f19108b;
        Integer num13 = state.z0;
        state18.z0 = Integer.valueOf(num13 == null ? typedArrayD.getDimensionPixelOffset(19, state18.x0.intValue()) : num13.intValue());
        State state19 = this.f19108b;
        Integer num14 = state.A0;
        state19.A0 = Integer.valueOf(num14 == null ? typedArrayD.getDimensionPixelOffset(26, state19.y0.intValue()) : num14.intValue());
        State state20 = this.f19108b;
        Integer num15 = state.D0;
        state20.D0 = Integer.valueOf(num15 == null ? typedArrayD.getDimensionPixelOffset(20, 0) : num15.intValue());
        State state21 = this.f19108b;
        Integer num16 = state.B0;
        state21.B0 = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        State state22 = this.f19108b;
        Integer num17 = state.C0;
        state22.C0 = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        State state23 = this.f19108b;
        Boolean bool2 = state.E0;
        state23.E0 = Boolean.valueOf(bool2 == null ? typedArrayD.getBoolean(0, false) : bool2.booleanValue());
        typedArrayD.recycle();
        Locale locale = state.o0;
        if (locale == null) {
            this.f19108b.o0 = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f19108b.o0 = locale;
        }
        this.f19107a = state;
    }
}
