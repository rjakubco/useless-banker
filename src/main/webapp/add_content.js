    $(document).ready(function() {
      $("#includedContent")[0].innerHTML = '\
      <div class="row row-cards-pf"> \
        <div class="col-xs-12 col-sm-6 col-md-3">\
          <div class="card-pf card-pf-accented card-pf-aggregate-status" style="height: 89px;">\
            <h4 class="card-pf-title" style="height: 17px;" id="example_\-ipsum\-">\
            <span class="fa fa-shield"></span><span class="card-pf-aggregate-status-count">0</span> Ipsum\
            </h4>\
            <div class="card-pf-body" style="height: 50px;">\
              <p class="card-pf-aggregate-status-notifications">\
                <span class="card-pf-aggregate-status-notification"><a href="#" class="add" data-toggle="uibTooltip" data-placement="top" title="Add Ipsum"><span class="pficon pficon-add-circle-o"></span></a></span>\
              </p>\
            </div>\
          </div>\
        </div>\
        <div class="col-xs-12 col-sm-6 col-md-3">\
          <div class="card-pf card-pf-accented card-pf-aggregate-status" style="height: 89px;">\
            <h4 class="card-pf-title" style="height: 17px;" id="example_\-\-">\
              <a href="#"><span class="fa fa-shield"></span><span class="card-pf-aggregate-status-count">20</span> Amet</a>\
            </h4>\
            <div class="card-pf-body" style="height: 50px;">\
              <p class="card-pf-aggregate-status-notifications">\
                <span class="card-pf-aggregate-status-notification"><a href="#"><span class="pficon pficon-error-circle-o"></span>4</a></span>\
                <span class="card-pf-aggregate-status-notification"><a href="#"><span class="pficon pficon-warning-triangle-o"></span>1</a></span>\
              </p>\
            </div>\
          </div>\
        </div>\
        <div class="col-xs-12 col-sm-6 col-md-3">\
            <div class="card-pf card-pf-accented card-pf-aggregate-status" style="height: 89px;">\
              <h4 class="card-pf-title" style="height: 17px;" id="example_\-\-">\
                <a href="#"><span class="fa fa-shield"></span><span class="card-pf-aggregate-status-count">9</span> Adipiscing</a>\
              </h4>\
              <div class="card-pf-body" style="height: 50px;">\
                <p class="card-pf-aggregate-status-notifications">\
                  <span class="card-pf-aggregate-status-notification"><span class="pficon pficon-ok"></span></span>\
                </p>\
              </div>\
          </div>\
        </div>\
        <div class="col-xs-12 col-sm-6 col-md-3">\
          <div class="card-pf card-pf-accented card-pf-aggregate-status" style="height: 89px;">\
            <h4 class="card-pf-title" style="height: 17px;" id="example_\-\-">\
              <a href="#"><span class="fa fa-shield"></span><span class="card-pf-aggregate-status-count">12</span> Lorem</a>\
            </h4>\
            <div class="card-pf-body" style="height: 50px;">\
              <p class="card-pf-aggregate-status-notifications">\
                <a href="#"><span class="card-pf-aggregate-status-notification"><span class="pficon pficon-error-circle-o"></span>1</span></a>\
              </p>\
            </div>\
          </div>\
        </div>\
      </div>\
      <div class="row row-cards-pf">\
        <div class="col-xs-12 col-sm-6 col-md-3">\
          <div class="card-pf card-pf-accented card-pf-aggregate-status card-pf-aggregate-status-mini" style="height: 59px;">\
            <h4 class="card-pf-title" style="height: 42px;" id="example_\-\-ipsum\-">\
              <span class="fa fa-rebel"></span>\
              <span class="card-pf-aggregate-status-count">0</span> Ipsum\
            </h4>\
            <div class="card-pf-body" style="height: 24px;">\
              <p class="card-pf-aggregate-status-notifications">\
                <span class="card-pf-aggregate-status-notification"><a href="#" class="add" data-toggle="uibTooltip" data-placement="top" title="Add Ipsum"><span class="pficon pficon-add-circle-o"></span></a></span>\
              </p>\
            </div>\
          </div>\
        </div>\
        <div class="col-xs-12 col-sm-6 col-md-3">\
          <div class="card-pf card-pf-accented card-pf-aggregate-status card-pf-aggregate-status-mini" style="height: 59px;">\
            <h4 class="card-pf-title" style="height: 42px;" id="example_\-\-\-amet\-\-">\
              <a href="#">\
                <span class="fa fa-paper-plane"></span>\
                <span class="card-pf-aggregate-status-count">20</span> Amet\
              </a>\
            </h4>\
            <div class="card-pf-body" style="height: 24px;">\
              <p class="card-pf-aggregate-status-notifications">\
                <span class="card-pf-aggregate-status-notification"><a href="#"><span class="pficon pficon-error-circle-o"></span>4</a></span>\
              </p>\
            </div>\
          </div>\
        </div>\
        <div class="col-xs-12 col-sm-6 col-md-3">\
          <div class="card-pf card-pf-accented card-pf-aggregate-status card-pf-aggregate-status-mini" style="height: 59px;">\
            <h4 class="card-pf-title" style="height: 42px;" id="example_\-\-\-adipiscing\-\-">\
              <a href="#">\
                <span class="pficon pficon-cluster"></span>\
                <span class="card-pf-aggregate-status-count">9</span> Adipiscing\
              </a>\
            </h4>\
            <div class="card-pf-body" style="height: 24px;">\
              <p class="card-pf-aggregate-status-notifications">\
                <span class="card-pf-aggregate-status-notification"><span class="pficon pficon-ok"></span></span>\
              </p>\
            </div>\
          </div>\
        </div>\
        <div class="col-xs-12 col-sm-6 col-md-3">\
          <div class="card-pf card-pf-accented card-pf-aggregate-status card-pf-aggregate-status-mini" style="height: 59px;">\
            <h4 class="card-pf-title" style="height: 42px;" id="example_\-\-\-lorem\-\-">\
              <a href="#">\
                <span class="pficon pficon-image"></span>\
                <span class="card-pf-aggregate-status-count">12</span> Lorem\
              </a>\
            </h4>\
            <div class="card-pf-body" style="height: 24px;">\
              <p class="card-pf-aggregate-status-notifications">\
                <a href="#"><span class="card-pf-aggregate-status-notification"><span class="pficon pficon-error-circle-o"></span>1</span></a>\
              </p>\
            </div>\
          </div>\
        </div>\
      </div>\
      <div class="row row-cards-pf">\
        <div class="col-xs-12 col-sm-6">\
          <div class="card-pf" style="height: 360px;">\
            <div class="card-pf-heading">\
              <h4 class="card-pf-title" style="height: 17px;" id="example_\-top-utilized\-">\
                Top Utilized\
              </h4>\
            </div>\
            <div class="card-pf-body" style="height: 280px;">\
              <div class="progress-description">\
                Ipsum\
              </div>\
              <div class="progress progress-label-top-right">\
                <div class="progress-bar progress-bar-danger" role="progressbar"style="width: 95%;" data-toggle="uibTooltip" title="95% Used">\
                  <span><strong>190.0 of 200.0 GB</strong> Used</span>\
                </div>\
                <div class="progress-bar progress-bar-remaining" role="progressbar" style="width: 5%;" data-toggle="uibTooltip" title="5% Available">\
                  <span class="sr-only">5% Available</span>\
                </div>\
              </div>\
              <div class="progress-description">\
                Amet\
              </div>\
              <div class="progress progress-label-top-right">\
                <div class="progress-bar progress-bar-success" role="progressbar" style="width: 50%;" data-toggle="uibTooltip" title="50% Used">\
                  <span><strong>100.0 of 200.0 GB</strong> Used</span>\
                </div>\
                <div class="progress-bar progress-bar-remaining" role="progressbar" style="width: 50%;" data-toggle="uibTooltip" title="50% Available">\
                  <span class="sr-only">50% Available</span>\
                </div>\
              </div>\
              <div class="progress-description">\
                Adipiscing\
              </div>\
              <div class="progress progress-label-top-right">\
                <div class="progress-bar progress-bar-warning" role="progressbar" style="width: 70%;" data-toggle="uibTooltip" title="70% Used">\
                  <span><strong>140.0 of 200.0 GB</strong> Used</span>\
                </div>\
                <div class="progress-bar progress-bar-remaining" role="progressbar" style="width: 30%;" data-toggle="uibTooltip" title="30% Available">\
                  <span class="sr-only">30% Available</span>\
                </div>\
              </div>\
              <div class="progress-description">\
                Lorem\
              </div>\
              <div class="progress progress-label-top-right">\
                <div class="progress-bar progress-bar-warning" role="progressbar" style="width: 76.5%;" data-toggle="uibTooltip" title="76.5% Used">\
                  <span><strong>153.0 of 200.0 GB</strong> Used</span>\
                </div>\
                <div class="progress-bar progress-bar-remaining" role="progressbar" style="width: 23.5%;" data-toggle="uibTooltip" title="23.5% Available">\
                  <span class="sr-only">23.5% Available</span>\
                </div>\
              </div>\
            </div>\
          </div>\
        </div>\
        <div class="col-xs-12 col-sm-6">\
          <div class="card-pf" style="height: 360px;">\
            <div class="card-pf-heading">\
              <h4 class="card-pf-title" style="height: 17px;" id="example_\-quotas\-">\
                Quotas\
              </h4>\
            </div>\
            <div class="card-pf-body" style="height: 280px;">\
              <div class="progress-container progress-description-left progress-label-right">\
                <div class="progress-description">\
                  Ipsum\
                </div>\
                <div class="progress">\
                  <div class="progress-bar" role="progressbar" style="width: 25%;" data-toggle="uibTooltip" title="25% Used">\
                    <span><strong>115 of 460</strong> MHz</span>\
                  </div>\
                  <div class="progress-bar progress-bar-remaining" role="progressbar" style="width: 75%;" data-toggle="uibTooltip" title="75% Available">\
                    <span class="sr-only">75% Available</span>\
                  </div>\
                </div>\
              </div>\
              <div class="progress-container progress-description-left progress-label-right">\
                <div class="progress-description">\
                  Amet\
                </div>\
                <div class="progress">\
                  <div class="progress-bar" role="progressbar" style="width: 50%;" data-toggle="uibTooltip" title="8 GB Used">\
                    <span><strong>8 of 16</strong> GB</span>\
                  </div>\
                  <div class="progress-bar progress-bar-remaining" role="progressbar" style="width: 50%;" data-toggle="uibTooltip" title="8 GB Available">\
                    <span class="sr-only">50% Available</span>\
                  </div>\
                </div>\
              </div>\
              <div class="progress-container progress-description-left progress-label-right">\
                <div class="progress-description">\
                  Adipiscing\
                </div>\
                <div class="progress">\
                  <div class="progress-bar" role="progressbar" style="width: 62.5%;" data-toggle="uibTooltip" title="62.5% Used">\
                    <span><strong>5 of 8</strong> Total</span>\
                  </div>\
                  <div class="progress-bar progress-bar-remaining" role="progressbar" style="width: 37.5%;" data-toggle="uibTooltip" title="37.5% Available">\
                    <span class="sr-only">37.5% Available</span>\
                  </div>\
                </div>\
              </div>\
              <div class="progress-container progress-description-left progress-label-right">\
                <div class="progress-description">\
                  Lorem\
                </div>\
                <div class="progress">\
                  <div class="progress-bar" role="progressbar" style="width: 100%;" data-toggle="uibTooltip" title="100% Used">\
                    <span><strong>2 of 2</strong> Total</span>\
                  </div>\
                </div>\
              </div>\
            </div>\
          </div>\
        </div>\
      </div>\
      ';
    });