package cn.lollipop.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionConstant {

    UPLOAD_FILE_ERROR(500, "文件上传失败！"),
    INVALID_FILE_TYPE(400, "无效的文件类型！"),
    INVALID_PARAM(400, "参数有误！"),
    CATEGORY_NOT_FOUND(404, "未查询到商品分类信息！"),
    BRAND_NOT_FOUNT(404, "未查询到品牌信息！"),
    BRAND_SAVE_ERROR(500, "品牌信息增加失败！"),
    SPEC_GROUP_NOT_FOUND(404, "未查询到商品规格信息！"),
    SPEC_PARAM_NOT_FOUND(404, "未查询到商品规格参数信息！"),
    SPEC_GROUP_UPDATE_ERROR(500, "商品规格信息更新失败！"),
    SPEC_GROUP_SAVE_ERROR(500, "商品规格信息增加失败！"),
    SPEC_PARAM_SAVE_ERROR(500, "商品规格参数信息增加失败！"),
    SPEC_PARAM_UPDATE_ERROR(500, "商品规格参数信息更新失败！"),
    GOODS_NOT_FOUND(404, "商品信息不存在！"),
    GOODS_SKU_NOT_FOUND(404, "商品SKU不存在！"),
    GOODS_SAVE_ERROR(500, "商品信息保存失败！"),
    GOODS_UPDATE_ERROR(500, "商品信息更新失败"),
    GOODS_DETAIL_NOT_FOUND(404, "商品详细信息不存在！"),
    GOODS_STOCK_NOT_FOUND(404, "商品库存信息不存在！");

    private int code;
    private String msg;
}
