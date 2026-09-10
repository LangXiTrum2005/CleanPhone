package com.unity3d.scar.adapter.common;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i implements g {
    protected String _description;
    protected Object[] _errorArguments;
    private Enum _errorCategory;

    public i(Enum r2, String str, Object... objArr) {
        this._errorCategory = r2;
        this._description = str;
        this._errorArguments = objArr;
    }

    public int getCode() {
        return -1;
    }

    public String getDescription() {
        return this._description;
    }

    public abstract String getDomain();

    public Object[] getErrorArguments() {
        return this._errorArguments;
    }

    public Enum<?> getErrorCategory() {
        return this._errorCategory;
    }
}
