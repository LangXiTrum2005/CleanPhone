package p002kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import p002kotlin.collections.dern;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class wireman<T> extends dern<T> {

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final attabal f31915monoploid = new attabal(null);

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public int f31916arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Object[] f31917kowloon;

    /* JADX INFO: compiled from: ArrayMap.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    /* JADX INFO: compiled from: ArrayMap.kt */
    public static final class saneness extends dern<T> {

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public int f31918monoploid = -1;

        /* JADX INFO: renamed from: polloi, reason: collision with root package name */
        public final /* synthetic */ wireman<T> f31919polloi;

        public saneness(wireman<T> wiremanVar) {
            this.f31919polloi = wiremanVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p002kotlin.collections.dern
        public void saneness() {
            do {
                int i = this.f31918monoploid + 1;
                this.f31918monoploid = i;
                if (i >= this.f31919polloi.f31917kowloon.length) {
                    break;
                }
            } while (this.f31919polloi.f31917kowloon[this.f31918monoploid] == null);
            if (this.f31918monoploid >= this.f31919polloi.f31917kowloon.length) {
                wireman();
                return;
            }
            Object obj = this.f31919polloi.f31917kowloon[this.f31918monoploid];
            Intrinsics.competently(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            marial(obj);
        }
    }

    public wireman(Object[] objArr, int i) {
        super(null);
        this.f31917kowloon = objArr;
        this.f31916arytenoidectomy = i;
    }

    private final void beachfront(int i) {
        Object[] objArr = this.f31917kowloon;
        if (objArr.length > i) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i);
        Object[] objArrCopyOf = Arrays.copyOf(this.f31917kowloon, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.f31917kowloon = objArrCopyOf;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.dern
    public T get(int i) {
        return (T) polloi.mathsort(this.f31917kowloon, i);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.dern, java.lang.Iterable
    public Iterator<T> iterator() {
        return new saneness(this);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.dern
    public int saneness() {
        return this.f31916arytenoidectomy;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.util.dern
    public void wireman(int i, T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        beachfront(i);
        if (this.f31917kowloon[i] == null) {
            this.f31916arytenoidectomy = saneness() + 1;
        }
        this.f31917kowloon[i] = value;
    }

    public wireman() {
        this(new Object[20], 0);
    }
}
