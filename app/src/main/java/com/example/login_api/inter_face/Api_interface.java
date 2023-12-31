package com.example.login_api.inter_face;

import com.example.login_api.DataModels.AlluserProduct;
import com.example.login_api.DataModels.DeletProduct;
import com.example.login_api.DataModels.LoginData;
import com.example.login_api.DataModels.ProductData;
import com.example.login_api.DataModels.RegisterData;
import com.example.login_api.DataModels.UpdateProduct;
import com.example.login_api.DataModels.UserProduct;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api_interface {
    @FormUrlEncoded
    @POST("register.php")
    Call<RegisterData> REGISTER_DATA_CALL(@Field("name") String name, @Field("email")String email, @Field("password")String password);
    @FormUrlEncoded
    @POST("login.php")
    Call<LoginData>LOGINMODEL_CALL(@Field("email") String email, @Field("password") String password);
    @FormUrlEncoded
    @POST("addProduct.php")
    Call<ProductData>PRODUCT_DATA_CALL(@Field("userid") Integer uid, @Field("pname") String pname, @Field("pprize") String price, @Field("pdes")String decription, @Field("productimage")String image);
    @FormUrlEncoded
    @POST("userproduct.php")
    Call<UserProduct>USER_PRODUCT_CALL(@Field("userid") Integer uid);
    @FormUrlEncoded
    @POST("allproduct.php")
    Call<AlluserProduct>ALLUSER_PRODUCT_CALL(@Field("userid") Integer id);
    @FormUrlEncoded
    @POST("deleteproduct.php")
    Call<DeletProduct>DELET_PRODUCT_CALL(@Field("id") Integer id);
    @FormUrlEncoded
    @POST("updateproduct.php")
    Call<UpdateProduct>UPDATE_PRODUCT_CALL(@Field("id") Integer id,@Field("name")String name,@Field("price")String price,@Field("description")String dec,@Field("imagedata")String imagedata,@Field("imagename")String imagename);

}
