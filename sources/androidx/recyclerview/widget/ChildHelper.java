package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.text.ttml.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class ChildHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView.AnonymousClass5 f8004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bucket f8005b = new Bucket();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8006c = new ArrayList();

    public static class Bucket {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f8007a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bucket f8008b;

        public final void a(int i2) {
            if (i2 < 64) {
                this.f8007a &= ~(1 << i2);
                return;
            }
            Bucket bucket = this.f8008b;
            if (bucket != null) {
                bucket.a(i2 - 64);
            }
        }

        public final int b(int i2) {
            Bucket bucket = this.f8008b;
            if (bucket == null) {
                return i2 >= 64 ? Long.bitCount(this.f8007a) : Long.bitCount(this.f8007a & ((1 << i2) - 1));
            }
            if (i2 < 64) {
                return Long.bitCount(this.f8007a & ((1 << i2) - 1));
            }
            return Long.bitCount(this.f8007a) + bucket.b(i2 - 64);
        }

        public final void c() {
            if (this.f8008b == null) {
                this.f8008b = new Bucket();
            }
        }

        public final boolean d(int i2) {
            if (i2 < 64) {
                return (this.f8007a & (1 << i2)) != 0;
            }
            c();
            return this.f8008b.d(i2 - 64);
        }

        public final void e(int i2, boolean z2) {
            if (i2 >= 64) {
                c();
                this.f8008b.e(i2 - 64, z2);
                return;
            }
            long j = this.f8007a;
            boolean z3 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i2) - 1;
            this.f8007a = ((j & (~j2)) << 1) | (j & j2);
            if (z2) {
                h(i2);
            } else {
                a(i2);
            }
            if (z3 || this.f8008b != null) {
                c();
                this.f8008b.e(0, z3);
            }
        }

        public final boolean f(int i2) {
            if (i2 >= 64) {
                c();
                return this.f8008b.f(i2 - 64);
            }
            long j = 1 << i2;
            long j2 = this.f8007a;
            boolean z2 = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f8007a = j3;
            long j4 = j - 1;
            this.f8007a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            Bucket bucket = this.f8008b;
            if (bucket != null) {
                if (bucket.d(0)) {
                    h(63);
                }
                this.f8008b.f(0);
            }
            return z2;
        }

        public final void g() {
            this.f8007a = 0L;
            Bucket bucket = this.f8008b;
            if (bucket != null) {
                bucket.g();
            }
        }

        public final void h(int i2) {
            if (i2 < 64) {
                this.f8007a |= 1 << i2;
            } else {
                c();
                this.f8008b.h(i2 - 64);
            }
        }

        public final String toString() {
            if (this.f8008b == null) {
                return Long.toBinaryString(this.f8007a);
            }
            return this.f8008b.toString() + "xx" + Long.toBinaryString(this.f8007a);
        }
    }

    public interface Callback {
    }

    public ChildHelper(RecyclerView.AnonymousClass5 anonymousClass5) {
        this.f8004a = anonymousClass5;
    }

    public final void a(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView.AnonymousClass5 anonymousClass5 = this.f8004a;
        RecyclerView recyclerView = RecyclerView.this;
        int childCount = i2 < 0 ? recyclerView.getChildCount() : d(i2);
        this.f8005b.e(childCount, z2);
        if (z2) {
            this.f8006c.add(view);
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }
        RecyclerView.ViewHolder childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt2 != null) {
            if (!childViewHolderInt2.isTmpDetached() && !childViewHolderInt2.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt2);
                throw new IllegalArgumentException(a.l(recyclerView, sb));
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "reAttach " + childViewHolderInt2);
            }
            childViewHolderInt2.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(a.l(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final View b(int i2) {
        return RecyclerView.this.getChildAt(d(i2));
    }

    public final int c() {
        return RecyclerView.this.getChildCount() - this.f8006c.size();
    }

    public final int d(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int childCount = RecyclerView.this.getChildCount();
        int i3 = i2;
        while (i3 < childCount) {
            Bucket bucket = this.f8005b;
            int iB = i2 - (i3 - bucket.b(i3));
            if (iB == 0) {
                while (bucket.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += iB;
        }
        return -1;
    }

    public final int e(View view) {
        int iIndexOfChild = RecyclerView.this.indexOfChild(view);
        if (iIndexOfChild != -1) {
            Bucket bucket = this.f8005b;
            if (!bucket.d(iIndexOfChild)) {
                return iIndexOfChild - bucket.b(iIndexOfChild);
            }
        }
        return -1;
    }

    public final void f(View view) {
        if (this.f8006c.remove(view)) {
            this.f8004a.a(view);
        }
    }

    public final String toString() {
        return this.f8005b.toString() + ", hidden list:" + this.f8006c.size();
    }
}
