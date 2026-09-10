package com.google.common.util.concurrent;

import com.google.common.base.Function;
import com.google.common.collect.Ordering;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class FuturesGetChecked {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20131a = 0;

    public interface GetCheckedTypeValidator {
    }

    public static class GetCheckedTypeValidatorHolder {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class WeakSetValidator implements GetCheckedTypeValidator {
            public static final /* synthetic */ WeakSetValidator[] X = {new WeakSetValidator("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            WeakSetValidator EF5;

            static {
                new CopyOnWriteArraySet();
            }

            public static WeakSetValidator valueOf(String str) {
                return (WeakSetValidator) Enum.valueOf(WeakSetValidator.class, str);
            }

            public static WeakSetValidator[] values() {
                return (WeakSetValidator[]) X.clone();
            }
        }

        static {
            int i2 = FuturesGetChecked.f20131a;
            WeakSetValidator[] weakSetValidatorArr = WeakSetValidator.X;
        }
    }

    static {
        final int i2 = 0;
        final int i3 = 1;
        Ordering orderingJ = Ordering.d().i(new Function() { // from class: com.google.common.util.concurrent.c
            @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                switch (i2) {
                    case 0:
                        int i4 = FuturesGetChecked.f20131a;
                        return Boolean.valueOf(((List) obj).contains(String.class));
                    case 1:
                        int i5 = FuturesGetChecked.f20131a;
                        return Boolean.valueOf(((List) obj).contains(Throwable.class));
                    default:
                        int i6 = FuturesGetChecked.f20131a;
                        return Arrays.asList(((Constructor) obj).getParameterTypes());
                }
            }
        }).a(Ordering.d().i(new Function() { // from class: com.google.common.util.concurrent.c
            @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                switch (i3) {
                    case 0:
                        int i4 = FuturesGetChecked.f20131a;
                        return Boolean.valueOf(((List) obj).contains(String.class));
                    case 1:
                        int i5 = FuturesGetChecked.f20131a;
                        return Boolean.valueOf(((List) obj).contains(Throwable.class));
                    default:
                        int i6 = FuturesGetChecked.f20131a;
                        return Arrays.asList(((Constructor) obj).getParameterTypes());
                }
            }
        })).j();
        final int i4 = 2;
        orderingJ.i(new Function() { // from class: com.google.common.util.concurrent.c
            @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                switch (i4) {
                    case 0:
                        int i5 = FuturesGetChecked.f20131a;
                        return Boolean.valueOf(((List) obj).contains(String.class));
                    case 1:
                        int i6 = FuturesGetChecked.f20131a;
                        return Boolean.valueOf(((List) obj).contains(Throwable.class));
                    default:
                        int i7 = FuturesGetChecked.f20131a;
                        return Arrays.asList(((Constructor) obj).getParameterTypes());
                }
            }
        });
    }
}
