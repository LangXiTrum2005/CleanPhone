package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.media.a;
import android.util.Log;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.p004ironsource.d9;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/NativeAppCallAttachmentStore;", "", "Attachment", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class NativeAppCallAttachmentStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static File f16355a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/NativeAppCallAttachmentStore$Attachment;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Attachment {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f16357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f16358c;
        public final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final UUID f16359e;
        public final Bitmap f;
        public final Uri g;

        public Attachment(UUID callId, Bitmap bitmap, Uri uri) {
            String strValueOf;
            Intrinsics.f(callId, "callId");
            this.f16359e = callId;
            this.f = bitmap;
            this.g = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if ("content".equalsIgnoreCase(scheme)) {
                    this.f16358c = true;
                    String authority = uri.getAuthority();
                    this.d = (authority == null || StringsKt.M(authority, d9.h.I0, false)) ? false : true;
                } else if (d9.h.f24719b.equalsIgnoreCase(uri.getScheme())) {
                    this.d = true;
                } else if (!Utility.E(uri)) {
                    throw new FacebookException(a.C("Unsupported scheme for media Uri : ", scheme));
                }
            } else {
                if (bitmap == null) {
                    throw new FacebookException("Cannot share media without a bitmap or Uri set");
                }
                this.d = true;
            }
            String string = !this.d ? null : UUID.randomUUID().toString();
            this.f16357b = string;
            if (this.d) {
                int i2 = FacebookContentProvider.X;
                strValueOf = String.format("%s%s/%s/%s", Arrays.copyOf(new Object[]{"content://com.facebook.app.FacebookContentProvider", FacebookSdk.c(), callId.toString(), string}, 4));
            } else {
                strValueOf = String.valueOf(uri);
            }
            this.f16356a = strValueOf;
        }
    }

    public static final void a(ArrayList arrayList) {
        File fileB;
        InputStream fileInputStream;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (f16355a == null) {
            Utility.k(c());
        }
        File fileC = c();
        if (fileC != null) {
            fileC.mkdirs();
        }
        ArrayList<File> arrayList2 = new ArrayList();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Attachment attachment = (Attachment) it.next();
                if (attachment.d && (fileB = b(attachment.f16359e, attachment.f16357b, true)) != null) {
                    arrayList2.add(fileB);
                    Bitmap bitmap = attachment.f;
                    if (bitmap != null) {
                        FileOutputStream fileOutputStream = new FileOutputStream(fileB);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            Utility.e(fileOutputStream);
                        } catch (Throwable th) {
                            Utility.e(fileOutputStream);
                            throw th;
                        }
                    } else {
                        Uri uri = attachment.g;
                        if (uri != null) {
                            boolean z2 = attachment.f16358c;
                            FileOutputStream fileOutputStream2 = new FileOutputStream(fileB);
                            if (z2) {
                                fileInputStream = FacebookSdk.b().getContentResolver().openInputStream(uri);
                            } else {
                                try {
                                    fileInputStream = new FileInputStream(uri.getPath());
                                } catch (Throwable th2) {
                                    Utility.e(fileOutputStream2);
                                    throw th2;
                                }
                            }
                            Utility.j(fileInputStream, fileOutputStream2);
                            Utility.e(fileOutputStream2);
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (IOException e2) {
            Log.e("com.facebook.internal.NativeAppCallAttachmentStore", "Got unexpected exception:" + e2);
            for (File file : arrayList2) {
                if (file != null) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
            throw new FacebookException(e2);
        }
    }

    public static final File b(UUID callId, String str, boolean z2) {
        Intrinsics.f(callId, "callId");
        File fileD = d(callId, z2);
        if (fileD == null) {
            return null;
        }
        try {
            return new File(fileD, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final synchronized File c() {
        try {
            if (f16355a == null) {
                f16355a = new File(FacebookSdk.b().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f16355a;
    }

    public static final File d(UUID callId, boolean z2) {
        Intrinsics.f(callId, "callId");
        if (f16355a == null) {
            return null;
        }
        File file = new File(f16355a, callId.toString());
        if (z2 && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
