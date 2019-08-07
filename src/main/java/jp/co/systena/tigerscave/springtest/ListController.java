package jp.co.systena.tigerscave.springtest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ListController {

  @Autowired
  HttpSession session; // セッション管理

  @RequestMapping(value = "/list", method = RequestMethod.GET) // URLとのマッピング
  public ModelAndView show(ModelAndView mav) {
    Cart cart = (Cart) session.getAttribute("cart");
    if (cart == null) {
      cart = new Cart();
    }
    session.setAttribute("cart", cart);
    mav.addObject("cart", cart);

    // リストフォームを新規設定
    mav.addObject("listForm", new ListForm());

    // 商品一覧設定
    ListService listService = new ListService();
    mav.addObject("itemList", listService.getItemList());

    //合計金額設定
    int total = totalMoney(cart, listService);
    mav.addObject("total", total);

    // Viewのテンプレート名を設定
    mav.setViewName("ListView");
    return mav;
  }

  @RequestMapping(value = "/list", method = RequestMethod.POST) // URLとのマッピング
  private ModelAndView order(ModelAndView mav, @Valid ListForm listForm,
      BindingResult bindingResult, HttpServletRequest request) {

    if (bindingResult.getAllErrors().size() > 0) {
      return new ModelAndView("redirect:/list");
    }

    return new ModelAndView("redirect:/list");
  }
}
