package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f33406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f33407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f33408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f33409d;

    public void a(int i10) {
        this.f33406a = i10;
        this.f33407b = i10;
        this.f33408c = i10;
    }

    public void authDeviceIdStatus(int i10) {
        this.f33407b = i10;
    }

    public void authGenDataStatus(int i10) {
        this.f33406a = i10;
    }

    public void authOtherDataStatus(int i10) {
        this.f33409d = i10;
    }

    public void authSerialIdStatus(int i10) {
        this.f33408c = i10;
    }

    public int getAuthDeviceIdStatus() {
        return this.f33407b;
    }

    public int getAuthGenDataStatus() {
        return this.f33406a;
    }

    public int getAuthSerialIdStatus() {
        return this.f33408c;
    }

    public int getOtherDataStatus() {
        return this.f33409d;
    }

    public int getStatusByKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "authority_serial_id":
                    return this.f33408c;
                case "authority_device_id":
                    return this.f33407b;
                case "authority_general_data":
                    return this.f33406a;
                case "authority_other":
                    return this.f33409d;
            }
        }
        return 1;
    }
}
