package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.ironsource.E4;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class CrashProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f28561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    E4 f28562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f28563c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Uri f28565e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f28568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f28569i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    UriMatcher f28564d = new UriMatcher(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f28566f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f28567g = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final String f28570j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = this.f28564d.match(uri);
        if (iMatch == 1) {
            return this.f28568h;
        }
        if (iMatch == 2) {
            return this.f28569i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f28561a = getContext();
        this.f28562b = new E4(this.f28561a);
        this.f28563c = this.f28561a.getPackageName();
        this.f28565e = Uri.parse("content://" + this.f28563c + "/REPORTS");
        this.f28568h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f28569i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int iMatch = this.f28564d.match(uri);
        if (iMatch == 1) {
            return E4.c();
        }
        if (iMatch == 2) {
            return E4.a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
