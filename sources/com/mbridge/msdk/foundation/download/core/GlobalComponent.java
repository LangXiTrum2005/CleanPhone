package com.mbridge.msdk.foundation.download.core;

import android.content.Context;
import android.database.Cursor;
import com.mbridge.msdk.foundation.download.MBDownloadConfig;
import com.mbridge.msdk.foundation.download.database.DatabaseHelper;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.c;
import com.mbridge.msdk.thrid.okhttp.m;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class GlobalComponent {
    private static volatile GlobalComponent INSTANCE;
    private MBDownloadConfig config;
    private Context context;
    private IDatabaseHelper databaseHelper;
    private ILogger logger;
    private volatile v okHttpClient;
    private int byteBufferSize = 4096;
    private String databaseTableName = DownloadModel.TABLE_NAME;

    private GlobalComponent() {
    }

    public static GlobalComponent getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (GlobalComponent.class) {
                try {
                    if (Objects.isNull(INSTANCE)) {
                        INSTANCE = new GlobalComponent();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return INSTANCE;
    }

    public int getByteBufferSize() {
        return this.byteBufferSize;
    }

    public Context getContext() {
        return this.context;
    }

    public IDatabaseHelper getDatabaseHelper() {
        return this.databaseHelper;
    }

    public String getDatabaseTableName() {
        return this.databaseTableName;
    }

    public ILogger getLogger() {
        if (this.logger == null) {
            this.logger = new ILogger() { // from class: com.mbridge.msdk.foundation.download.core.GlobalComponent.1
                @Override // com.mbridge.msdk.foundation.download.utils.ILogger
                public void log(String str, String str2) {
                    q0.a(str, str2);
                }

                @Override // com.mbridge.msdk.foundation.download.utils.ILogger
                public void log(String str, Exception exc) {
                    q0.a(str, exc.getMessage());
                }
            };
        }
        return this.logger;
    }

    public v getOkHttpClient() {
        if (this.okHttpClient == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(w.HTTP_1_1);
            m mVar = new m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), c.a("OkHttp Dispatcher", false)));
            mVar.a(this.config.getMaxRequests());
            mVar.b(this.config.getMaxRequestsPerHost());
            v.b bVar = new v.b();
            long defaultConnectTimeout = this.config.getDefaultConnectTimeout();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.okHttpClient = bVar.b(defaultConnectTimeout, timeUnit).d(this.config.getDefaultConnectTimeout(), timeUnit).e(this.config.getDefaultWriteTimeout(), timeUnit).a(mVar).c(this.config.getDefaultPingInterval(), timeUnit).b(true).a(new i(32, 5L, TimeUnit.MINUTES)).a(arrayList).a();
        }
        return this.okHttpClient;
    }

    public void initialize(Context context, MBDownloadConfig mBDownloadConfig) {
        this.context = context.getApplicationContext();
        this.logger = mBDownloadConfig.getLogger();
        this.config = mBDownloadConfig;
        if (mBDownloadConfig.getDatabaseHandler() == null || mBDownloadConfig.getDatabaseHelper() == null) {
            this.databaseHelper = new IDatabaseHelper() { // from class: com.mbridge.msdk.foundation.download.core.GlobalComponent.2
                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public List<DownloadModel> findAll() {
                    return null;
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public List<DownloadModel> getUnwantedModels(long j10) {
                    return null;
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public Cursor rawQuery(String str, String[] strArr) {
                    return null;
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void remove(String str) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void remove(String str, String str2) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void clear() {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void insert(DownloadModel downloadModel) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void findByDownloadUrl(String str, IDatabaseHelper.IDatabaseListener iDatabaseListener) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void update(DownloadModel downloadModel, String str) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void find(String str, String str2, IDatabaseHelper.IDatabaseListener iDatabaseListener) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void updateProgress(String str, String str2, DownloadModel downloadModel) {
                }

                @Override // com.mbridge.msdk.foundation.download.database.IDatabaseHelper
                public void updateUnzipResource(String str, String str2, long j10) {
                }
            };
        } else {
            this.databaseHelper = new DatabaseHelper(context, mBDownloadConfig.getDatabaseHandler(), mBDownloadConfig.getDatabaseHelper());
        }
    }
}
