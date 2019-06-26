<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!--컨트롤러 코드 -->

	<!-- 
@RequestMapping("productRoomDelete")
   public String productRoomDelete(ProductDTO pDTO, ProductCoordJsonFile pcjf) {
      try {
         String a[] = pDTO.getpId().split(",");
         for (int i = 0; i < a.length; i++) {
            ProductDTO dto = dao.productRoomSelect(a[i]);
            String[] b = dto.getpPicture().split(",");
            for (int j = 0; j < b.length; j++) {
               //File file = new File("C:\\SDM\\BinBangProject\\src\\main\\webapp\\resources\\img\\" + dto.getpUserId() + "\\" + b[j]);
               File file = new File("D:\\SDM\\BinBangProject\\src\\main\\webapp\\resources\\img\\" + dto.getpUserId() + "\\" + b[j]);
               System.out.println(file);
               if (file.exists()) {
                  file.delete();
               }
            }
            
            dao.productRoomDelete(a[i]);
         }
   
         List<ProductDTO> list = dao.productRoomSearch();
         pcjf.productCoord(list);
   
         return "productRoomDeleteOK";
      } catch (Exception e) {
         // TODO: handle exception
         
         return "productRoomDeleteNOT";
      }
   }
 -->


	<!-- 페이지 코드 -->


	<!-- 
<script>   
   $(function(){
      $("#deleteButton").click(function(){
         if(!$("input[type='checkbox']").is(":checked")){
            alert("삭제할 매물을 선택하세요.");
            location.reload();
         } else {
            $("#productDeleteForm").submit();
         }
      });
      
      $("#pIdChkAll").click(function(){
         if($("#pIdChkAll").prop("checked")){
            $("input[type='checkbox']").prop("checked",true);
         } else {
            $("input[type='checkbox']").prop("checked",false);
         }
      });
   });
</script>
   
   <button type="button" id="deleteButton">삭제</button>
   <input type="checkbox" id="pIdChkAll">
 -->
</body>
</html>