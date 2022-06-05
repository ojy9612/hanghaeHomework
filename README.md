# hanghaeHomework
항해99 PBL 1주차 과제

  |**기능**|**Method**|**URL**|**Return**|**비고**
  |:---:|:---:|:---:|:---:|:---:|
  |전체 게시글 목록 조회|GET|/api/boards/all|List<Contents>|작성 날짜 기준 내림차순|
  |게시글 작성|POST|/api/boards|Contents|
  |게시글 조회|GET|/api/boards/{nid}|Contents|
  |게시글 수정|PUT|/api/boards/{nid}|Long|
  |게시글 삭제|DELETE|/api/boards/{nid}|Long|
  |댓글 목록 조회|GET|/api/comments/{nid}|List<Comments>|작성 날짜 기준 내림차순|
  |댓글 작성|POST|/api/comments/{nid}|Comments|
  |댓글 수정|PUT|/api/comments/{mid}|Long|
  |댓글 삭제|DELETE|/api/comments/{mid}|Long|
