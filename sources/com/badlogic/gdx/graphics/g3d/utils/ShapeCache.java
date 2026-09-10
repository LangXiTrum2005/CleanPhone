package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Renderable;
import com.badlogic.gdx.graphics.g3d.RenderableProvider;
import com.badlogic.gdx.graphics.g3d.model.MeshPart;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.Pool;

/* JADX INFO: loaded from: classes.dex */
public class ShapeCache implements Disposable, RenderableProvider {
    private final MeshBuilder builder;
    private boolean building;
    private final String id;
    private final Mesh mesh;
    private final Renderable renderable;

    public ShapeCache() {
        this(5000, 5000, new VertexAttributes(new VertexAttribute(1, 3, ShaderProgram.POSITION_ATTRIBUTE), new VertexAttribute(4, 4, ShaderProgram.COLOR_ATTRIBUTE)), 1);
    }

    public MeshPartBuilder begin() {
        return begin(1);
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
        this.mesh.dispose();
    }

    public void end() {
        if (!this.building) {
            throw new GdxRuntimeException("Call begin() prior to calling end()");
        }
        this.building = false;
        this.builder.end(this.mesh);
    }

    public Material getMaterial() {
        return this.renderable.material;
    }

    @Override // com.badlogic.gdx.graphics.g3d.RenderableProvider
    public void getRenderables(Array<Renderable> array, Pool<Renderable> pool) {
        array.add(this.renderable);
    }

    public Matrix4 getWorldTransform() {
        return this.renderable.worldTransform;
    }

    public ShapeCache(int i, int i2, VertexAttributes vertexAttributes, int i3) {
        this.id = "id";
        Renderable renderable = new Renderable();
        this.renderable = renderable;
        Mesh mesh = new Mesh(false, i, i2, vertexAttributes);
        this.mesh = mesh;
        this.builder = new MeshBuilder();
        MeshPart meshPart = renderable.meshPart;
        meshPart.mesh = mesh;
        meshPart.primitiveType = i3;
        renderable.material = new Material();
    }

    public MeshPartBuilder begin(int i) {
        if (this.building) {
            throw new GdxRuntimeException("Call end() after calling begin()");
        }
        this.building = true;
        this.builder.begin(this.mesh.getVertexAttributes());
        this.builder.part("id", i, this.renderable.meshPart);
        return this.builder;
    }
}
