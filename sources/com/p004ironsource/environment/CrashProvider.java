package com.p004ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.media.a;
import com.p004ironsource.ha;

/* JADX INFO: loaded from: classes5.dex */
public class CrashProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f24916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ha f24917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f24918c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Uri f24919e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f24920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f24921i;
    UriMatcher d = new UriMatcher(-1);
    final int f = 1;
    final int g = 2;
    final String j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = this.d.match(uri);
        if (iMatch == 1) {
            return this.f24920h;
        }
        if (iMatch == 2) {
            return this.f24921i;
        }
        throw new IllegalArgumentException(a.k(uri, "Invalid URI: "));
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f24916a = getContext();
        this.f24917b = new ha(this.f24916a);
        this.f24918c = this.f24916a.getPackageName();
        this.f24919e = Uri.parse("content://" + this.f24918c + "/REPORTS");
        this.f24920h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f24921i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int iMatch = this.d.match(uri);
        if (iMatch == 1) {
            return ha.c();
        }
        if (iMatch == 2) {
            return ha.a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException(a.k(uri, "Invalid URI: "));
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
