package com.mbridge.msdk.config.component.load.downloader.database;

import android.content.ContentValues;
import android.database.Cursor;
import com.ironsource.V5;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f32230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f32232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f32233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f32234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f32235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f32236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f32237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f32238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f32239k;
    private String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f32240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f32241n;

    private b() {
    }

    public void a(long j10) {
        this.f32230b = j10;
    }

    public void b(int i10) {
        this.f32237i = i10;
    }

    public void c(long j10) {
        this.f32235g = j10;
    }

    public long d() {
        return this.f32230b;
    }

    public void e(long j10) {
        this.f32231c = j10;
    }

    public void f(String str) {
        this.f32229a = str;
    }

    public long g() {
        return this.f32240m;
    }

    public String h() {
        return this.f32236h;
    }

    public String i() {
        return this.f32229a;
    }

    public int j() {
        return this.f32237i;
    }

    public long k() {
        return this.f32235g;
    }

    public long l() {
        return this.f32234f;
    }

    public String m() {
        return this.f32233e;
    }

    public long n() {
        return this.f32231c;
    }

    public String a() {
        return this.l;
    }

    public String b() {
        return this.f32239k;
    }

    public String c() {
        return this.f32238j;
    }

    public void d(String str) {
        this.f32232d = str;
        try {
            URL url = new URL(str);
            this.f32233e = url.getProtocol() + "://" + url.getHost() + url.getPath();
        } catch (Exception e10) {
            q0.b("DownloadInfo", e10.getMessage(), e10);
        }
    }

    public void e(String str) {
        this.f32236h = str;
    }

    public String f() {
        return this.f32232d;
    }

    public void a(String str) {
        this.l = str;
    }

    public void b(String str) {
        this.f32239k = str;
    }

    public void c(String str) {
        this.f32238j = str;
    }

    public int e() {
        return this.f32241n;
    }

    public void a(int i10) {
        this.f32241n = i10;
    }

    public void b(long j10) {
        this.f32240m = j10;
    }

    public static b a(String str, String str2, long j10, long j11, long j12, long j13, long j14, int i10, String str3, int i11, String str4, String str5, String str6) {
        b bVar = new b();
        bVar.d(str);
        bVar.f(str2);
        bVar.c(j13);
        bVar.a(j10);
        bVar.e(j11);
        bVar.d(j12);
        bVar.c(str3);
        bVar.b(i11);
        bVar.e(str4);
        bVar.b(str5);
        bVar.a(str6);
        bVar.b(j14);
        bVar.a(i10);
        return bVar;
    }

    public static ContentValues b(b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("URL", bVar.m());
        contentValues.put(V5.c.f27367c, bVar.i());
        contentValues.put("fileSize", Long.valueOf(bVar.k()));
        contentValues.put("touchTime", Long.valueOf(bVar.l()));
        contentValues.put("createTime", Long.valueOf(bVar.d()));
        contentValues.put("successTime", Long.valueOf(bVar.n()));
        contentValues.put("downloadedSize", Long.valueOf(bVar.g()));
        contentValues.put("downloadProgress", Integer.valueOf(bVar.e()));
        contentValues.put("md5", bVar.h());
        contentValues.put("status", Integer.valueOf(bVar.j()));
        contentValues.put("cacheKey", bVar.b());
        contentValues.put("businessType", bVar.a());
        return contentValues;
    }

    public void d(long j10) {
        this.f32234f = j10;
    }

    public static b a(Cursor cursor) {
        b bVar = new b();
        cursor.moveToFirst();
        for (String str : cursor.getColumnNames()) {
            int columnIndex = cursor.getColumnIndex(str);
            if (columnIndex != -1) {
                str.getClass();
                switch (str) {
                    case "downloadProgress":
                        bVar.a(cursor.getInt(columnIndex));
                        break;
                    case "successTime":
                        bVar.e(cursor.getLong(columnIndex));
                        break;
                    case "status":
                        bVar.b(cursor.getInt(columnIndex));
                        break;
                    case "filePath":
                        bVar.f(cursor.getString(columnIndex));
                        break;
                    case "fileSize":
                        bVar.c(cursor.getLong(columnIndex));
                        break;
                    case "businessType":
                        bVar.a(cursor.getString(columnIndex));
                        break;
                    case "cacheKey":
                        bVar.b(cursor.getString(columnIndex));
                        break;
                    case "contentType":
                        bVar.c(cursor.getString(columnIndex));
                        break;
                    case "md5":
                        bVar.e(cursor.getString(columnIndex));
                        break;
                    case "touchTime":
                        bVar.d(cursor.getLong(columnIndex));
                        break;
                    case "downloadedSize":
                        bVar.b(cursor.getLong(columnIndex));
                        break;
                    case "createTime":
                        bVar.a(cursor.getLong(columnIndex));
                        break;
                    case "originalURL":
                        bVar.d(cursor.getString(columnIndex));
                        break;
                }
            }
        }
        return bVar;
    }

    public static ContentValues a(b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("originalURL", bVar.f());
        contentValues.put("URL", bVar.m());
        contentValues.put(V5.c.f27367c, bVar.i());
        contentValues.put("fileSize", Long.valueOf(bVar.k()));
        contentValues.put("touchTime", Long.valueOf(bVar.l()));
        contentValues.put("createTime", Long.valueOf(bVar.d()));
        contentValues.put("successTime", Long.valueOf(bVar.n()));
        contentValues.put("downloadedSize", Long.valueOf(bVar.g()));
        contentValues.put("downloadProgress", Integer.valueOf(bVar.e()));
        contentValues.put("md5", bVar.h());
        contentValues.put("status", Integer.valueOf(bVar.j()));
        contentValues.put("cacheKey", bVar.b());
        contentValues.put("businessType", bVar.a());
        return contentValues;
    }
}
