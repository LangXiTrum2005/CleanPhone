package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class InputContentInfoCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputContentInfoCompatImpl f4556a;

    public static final class InputContentInfoCompatBaseImpl implements InputContentInfoCompatImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f4558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ClipDescription f4559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f4560c;

        public InputContentInfoCompatBaseImpl(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f4558a = uri;
            this.f4559b = clipDescription;
            this.f4560c = uri2;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final Object a() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final Uri b() {
            return this.f4558a;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final void c() {
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final Uri d() {
            return this.f4560c;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final ClipDescription getDescription() {
            return this.f4559b;
        }
    }

    public interface InputContentInfoCompatImpl {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public InputContentInfoCompat(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f4556a = new InputContentInfoCompatApi25Impl(uri, clipDescription, uri2);
        } else {
            this.f4556a = new InputContentInfoCompatBaseImpl(uri, clipDescription, uri2);
        }
    }

    public static final class InputContentInfoCompatApi25Impl implements InputContentInfoCompatImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputContentInfo f4557a;

        public InputContentInfoCompatApi25Impl(Object obj) {
            this.f4557a = (InputContentInfo) obj;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final Object a() {
            return this.f4557a;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final Uri b() {
            return this.f4557a.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final void c() {
            this.f4557a.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final Uri d() {
            return this.f4557a.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final ClipDescription getDescription() {
            return this.f4557a.getDescription();
        }

        public InputContentInfoCompatApi25Impl(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f4557a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public InputContentInfoCompat(InputContentInfoCompatApi25Impl inputContentInfoCompatApi25Impl) {
        this.f4556a = inputContentInfoCompatApi25Impl;
    }
}
