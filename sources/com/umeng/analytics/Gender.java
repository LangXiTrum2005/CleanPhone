package com.umeng.analytics;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.Locale;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Male' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public class Gender {
    public static final Gender Female;
    public static final Gender Male;
    public static final Gender Unknown;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ Gender[] f2469a;
    public int value;

    /* JADX INFO: renamed from: com.umeng.analytics.Gender$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2470a;

        static {
            int[] iArr = new int[Gender.values().length];
            f2470a = iArr;
            try {
                iArr[Gender.Male.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2470a[Gender.Female.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2470a[Gender.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        int i = 0;
        int i2 = 1;
        Gender gender = new Gender("Male", i, i2) { // from class: com.umeng.analytics.Gender.1
            @Override // java.lang.Enum
            public String toString() {
                Locale locale = Locale.US;
                return AbstractC3950lJ.p("Male:", this.value);
            }
        };
        Male = gender;
        int i3 = 2;
        Gender gender2 = new Gender("Female", i2, i3) { // from class: com.umeng.analytics.Gender.2
            @Override // java.lang.Enum
            public String toString() {
                Locale locale = Locale.US;
                return AbstractC3950lJ.p("Female:", this.value);
            }
        };
        Female = gender2;
        Gender gender3 = new Gender("Unknown", i3, i) { // from class: com.umeng.analytics.Gender.3
            @Override // java.lang.Enum
            public String toString() {
                Locale locale = Locale.US;
                return AbstractC3950lJ.p("Unknown:", this.value);
            }
        };
        Unknown = gender3;
        f2469a = new Gender[]{gender, gender2, gender3};
    }

    public static Gender getGender(int i) {
        if (i != 1) {
            return i != 2 ? Unknown : Female;
        }
        return Male;
    }

    public static com.umeng.commonsdk.statistics.proto.Gender transGender(Gender gender) {
        int i = AnonymousClass4.f2470a[gender.ordinal()];
        if (i != 1) {
            return i != 2 ? com.umeng.commonsdk.statistics.proto.Gender.UNKNOWN : com.umeng.commonsdk.statistics.proto.Gender.FEMALE;
        }
        return com.umeng.commonsdk.statistics.proto.Gender.MALE;
    }

    public static Gender valueOf(String str) {
        return (Gender) Enum.valueOf(Gender.class, str);
    }

    public static Gender[] values() {
        return (Gender[]) f2469a.clone();
    }

    public int value() {
        return this.value;
    }

    private Gender(String str, int i, int i2) {
        super(str, i);
        this.value = i2;
    }
}
