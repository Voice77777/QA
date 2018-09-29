select i.InstrumentCode, r.RatingValue,
ra.RatingAgencyName, rt.RatingTypeCode
from instrument as i
join rating as r
using (RatingID)
join ratingagency as ra
using (RatingAgencyID)
join ratingtype as rt
using (RatingTypeID)