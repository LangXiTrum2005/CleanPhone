package com.google.common.collect;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class SortedLists {

    public enum KeyAbsentBehavior {
        X { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.1
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public final int a(int i2) {
                return i2 - 1;
            }
        },
        f19956Y { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.2
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public final int a(int i2) {
                return i2;
            }
        },
        /* JADX INFO: Fake field, exist only in values array */
        EF16 { // from class: com.google.common.collect.SortedLists.KeyAbsentBehavior.3
            @Override // com.google.common.collect.SortedLists.KeyAbsentBehavior
            public final int a(int i2) {
                return ~i2;
            }
        };

        public abstract int a(int i2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class KeyPresentBehavior {
        public static final AnonymousClass1 X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final AnonymousClass2 f19957Y;
        public static final AnonymousClass3 Z;
        public static final AnonymousClass4 e0;
        public static final /* synthetic */ KeyPresentBehavior[] f0;

        /* JADX INFO: renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$2, reason: invalid class name */
        public final enum AnonymousClass2 extends KeyPresentBehavior {
            public AnonymousClass2() {
                super("LAST_PRESENT", 1);
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public final int a(Comparable comparable, List list, int i2) {
                NaturalOrdering naturalOrdering = NaturalOrdering.Z;
                int size = list.size() - 1;
                while (i2 < size) {
                    int i3 = ((i2 + size) + 1) >>> 1;
                    if (naturalOrdering.compare(list.get(i3), comparable) > 0) {
                        size = i3 - 1;
                    } else {
                        i2 = i3;
                    }
                }
                return i2;
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.SortedLists$KeyPresentBehavior$3, reason: invalid class name */
        public final enum AnonymousClass3 extends KeyPresentBehavior {
            public AnonymousClass3() {
                super("FIRST_PRESENT", 2);
            }

            @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
            public final int a(Comparable comparable, List list, int i2) {
                NaturalOrdering naturalOrdering = NaturalOrdering.Z;
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = (i3 + i2) >>> 1;
                    if (naturalOrdering.compare(list.get(i4), comparable) < 0) {
                        i3 = i4 + 1;
                    } else {
                        i2 = i4;
                    }
                }
                return i3;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.collect.SortedLists$KeyPresentBehavior$1] */
        /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.collect.SortedLists$KeyPresentBehavior$4] */
        static {
            ?? r0 = new KeyPresentBehavior() { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.1
                @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
                public final int a(Comparable comparable, List list, int i2) {
                    return i2;
                }
            };
            X = r0;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            f19957Y = anonymousClass2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            Z = anonymousClass3;
            ?? r3 = new KeyPresentBehavior() { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.4
                @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
                public final int a(Comparable comparable, List list, int i2) {
                    return KeyPresentBehavior.f19957Y.a(comparable, list, i2) + 1;
                }
            };
            e0 = r3;
            f0 = new KeyPresentBehavior[]{r0, anonymousClass2, anonymousClass3, r3, new KeyPresentBehavior() { // from class: com.google.common.collect.SortedLists.KeyPresentBehavior.5
                @Override // com.google.common.collect.SortedLists.KeyPresentBehavior
                public final int a(Comparable comparable, List list, int i2) {
                    return KeyPresentBehavior.Z.a(comparable, list, i2) - 1;
                }
            }};
        }

        public static KeyPresentBehavior valueOf(String str) {
            return (KeyPresentBehavior) Enum.valueOf(KeyPresentBehavior.class, str);
        }

        public static KeyPresentBehavior[] values() {
            return (KeyPresentBehavior[]) f0.clone();
        }

        public abstract int a(Comparable comparable, List list, int i2);
    }
}
