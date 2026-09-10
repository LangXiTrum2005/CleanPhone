package androidx.core.view;

import A.AbstractC0912t;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final class ContentInfoCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Compat f4423a;

    public static final class Api31Impl {
        public static Pair<ContentInfo, ContentInfo> a(ContentInfo contentInfo, Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean zTest = predicate.test(clip.getItemAt(0));
                ContentInfo contentInfo2 = zTest ? contentInfo : null;
                if (zTest) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (int i2 = 0; i2 < clip.getItemCount(); i2++) {
                ClipData.Item itemAt = clip.getItemAt(i2);
                if (predicate.test(itemAt)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(itemAt);
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(itemAt);
                }
            }
            Pair pairCreate = arrayList == null ? Pair.create(null, clip) : arrayList2 == null ? Pair.create(clip, null) : Pair.create(ContentInfoCompat.a(clip.getDescription(), arrayList), ContentInfoCompat.a(clip.getDescription(), arrayList2));
            if (pairCreate.first == null) {
                return Pair.create(null, contentInfo);
            }
            return pairCreate.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) pairCreate.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) pairCreate.second).build());
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BuilderCompat f4424a;

        public Builder(ClipData clipData, int i2) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f4424a = new BuilderCompat31Impl(clipData, i2);
                return;
            }
            BuilderCompatImpl builderCompatImpl = new BuilderCompatImpl();
            builderCompatImpl.f4426a = clipData;
            builderCompatImpl.f4427b = i2;
            this.f4424a = builderCompatImpl;
        }

        public final ContentInfoCompat a() {
            return this.f4424a.build();
        }

        public final void b(Bundle bundle) {
            this.f4424a.setExtras(bundle);
        }

        public final void c(int i2) {
            this.f4424a.setFlags(i2);
        }

        public final void d(Uri uri) {
            this.f4424a.a(uri);
        }
    }

    public interface BuilderCompat {
        void a(Uri uri);

        ContentInfoCompat build();

        void setExtras(Bundle bundle);

        void setFlags(int i2);
    }

    public static final class BuilderCompat31Impl implements BuilderCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f4425a;

        public BuilderCompat31Impl(ClipData clipData, int i2) {
            this.f4425a = AbstractC0912t.j(clipData, i2);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void a(Uri uri) {
            this.f4425a.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new Compat31Impl(this.f4425a.build()));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void setExtras(Bundle bundle) {
            this.f4425a.setExtras(bundle);
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void setFlags(int i2) {
            this.f4425a.setFlags(i2);
        }
    }

    public static final class BuilderCompatImpl implements BuilderCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ClipData f4426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4428c;
        public Uri d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f4429e;

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void a(Uri uri) {
            this.d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new CompatImpl(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void setExtras(Bundle bundle) {
            this.f4429e = bundle;
        }

        @Override // androidx.core.view.ContentInfoCompat.BuilderCompat
        public final void setFlags(int i2) {
            this.f4428c = i2;
        }
    }

    public interface Compat {
        int f();

        ContentInfo g();

        int getFlags();

        ClipData h();
    }

    public static final class Compat31Impl implements Compat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo f4430a;

        public Compat31Impl(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f4430a = AbstractC0912t.l(contentInfo);
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int f() {
            return this.f4430a.getSource();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ContentInfo g() {
            return this.f4430a;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int getFlags() {
            return this.f4430a.getFlags();
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ClipData h() {
            return this.f4430a.getClip();
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f4430a + "}";
        }
    }

    public static final class CompatImpl implements Compat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClipData f4431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4433c;
        public final Uri d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f4434e;

        public CompatImpl(BuilderCompatImpl builderCompatImpl) {
            ClipData clipData = builderCompatImpl.f4426a;
            clipData.getClass();
            this.f4431a = clipData;
            int i2 = builderCompatImpl.f4427b;
            if (i2 < 0) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
            }
            if (i2 > 5) {
                Locale locale2 = Locale.US;
                throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
            }
            this.f4432b = i2;
            int i3 = builderCompatImpl.f4428c;
            if ((i3 & 1) == i3) {
                this.f4433c = i3;
                this.d = builderCompatImpl.d;
                this.f4434e = builderCompatImpl.f4429e;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i3) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int f() {
            return this.f4432b;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ContentInfo g() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final int getFlags() {
            return this.f4433c;
        }

        @Override // androidx.core.view.ContentInfoCompat.Compat
        public final ClipData h() {
            return this.f4431a;
        }

        public final String toString() {
            String strValueOf;
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f4431a.getDescription());
            sb.append(", source=");
            int i2 = this.f4432b;
            if (i2 == 0) {
                strValueOf = "SOURCE_APP";
            } else if (i2 == 1) {
                strValueOf = "SOURCE_CLIPBOARD";
            } else if (i2 == 2) {
                strValueOf = "SOURCE_INPUT_METHOD";
            } else if (i2 == 3) {
                strValueOf = "SOURCE_DRAG_AND_DROP";
            } else if (i2 != 4) {
                strValueOf = i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT";
            } else {
                strValueOf = "SOURCE_AUTOFILL";
            }
            sb.append(strValueOf);
            sb.append(", flags=");
            int i3 = this.f4433c;
            sb.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
            Uri uri = this.d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return android.support.v4.media.a.r(sb, this.f4434e != null ? ", hasExtras" : "", "}");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }

    public ContentInfoCompat(Compat compat) {
        this.f4423a = compat;
    }

    public static ClipData a(ClipDescription clipDescription, ArrayList arrayList) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) arrayList.get(0));
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            clipData.addItem((ClipData.Item) arrayList.get(i2));
        }
        return clipData;
    }

    public final ClipData b() {
        return this.f4423a.h();
    }

    public final int c() {
        return this.f4423a.getFlags();
    }

    public final int d() {
        return this.f4423a.f();
    }

    public final String toString() {
        return this.f4423a.toString();
    }
}
